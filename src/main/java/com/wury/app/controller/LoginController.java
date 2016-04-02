/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wury.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author ABYOR
 */
@Controller
public class LoginController {
    
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(){
        return "all_user/login_modal";
    }
    
    @RequestMapping(value = "login-fail", method = RequestMethod.GET)
    public String loginFail(RedirectAttributes attributes){
        attributes.addFlashAttribute("success", false);
        return "redirect:login";
    }
    
}
