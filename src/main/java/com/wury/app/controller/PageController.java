/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wury.app.controller;

import com.wury.app.entity.Author;
import com.wury.app.entity.Role;
import com.wury.app.service.AuthorService;
import com.wury.app.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author ABYOR
 */
@Controller
public class PageController {
    
    @Autowired
    private AuthorService authorService;
    @Autowired
    private RoleService roleService;
    
    @RequestMapping(value = "/")
    public ModelAndView mainPageAllUsers(){
        ModelAndView mav = new ModelAndView("all_user/home");
        return mav;
    }
    
    @RequestMapping(value = "/home")
    public ModelAndView indexAllUsers(){
        ModelAndView mav = new ModelAndView("all_user/home");
        return mav;
    }
    
    @RequestMapping(value = "/about")
    public ModelAndView about(){
        ModelAndView mav = new ModelAndView("all_user/about");
        return mav;
    }
    
    @ModelAttribute("newAuthor")
    public Author getAuthor(){
        return new Author();
    }
    
    @RequestMapping(value = "/sign-up", method = RequestMethod.POST)
    public String registerAuthor(@ModelAttribute("newAuthor") Author newAuthor, BindingResult result, RedirectAttributes attributes){
        Role role = roleService.fineOne(1);
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        newAuthor.setPassword(encoder.encode(newAuthor.getPassword()));
        newAuthor.setRole(role);
        newAuthor.setEnabled(true);
        authorService.save(newAuthor);
        attributes.addFlashAttribute("sign-up",true);
        return "redirect:home";
    }
    
}
