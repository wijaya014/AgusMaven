/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wury.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ABYOR
 */
@Controller
@RequestMapping(value = "/author")
public class AuthorController {
    
    @RequestMapping(value = "/my-posts", method = RequestMethod.GET)
    public ModelAndView myPost(){
        ModelAndView mav = new ModelAndView("author/my_posts");
        return mav;
    }
    
}
