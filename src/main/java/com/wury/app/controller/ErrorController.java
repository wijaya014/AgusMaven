/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wury.app.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ABYOR
 */
@Controller
@RequestMapping("/error")
public class ErrorController {
    
@RequestMapping
	public ModelAndView errorPage(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("all_user/error_page");
		Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");

		switch (statusCode) {
		case 400:
			mav.addObject("messageProperty", "Bad Request");
			break;
		case 403:
			mav.addObject("messageProperty", "Access Denied");
			break;
		case 404:
			mav.addObject("messageProperty", "Resources Not Found");
			break;
		case 500:
			mav.addObject("messageProperty", "Internal Server Error");
			break;
		default:
			mav.addObject("messageProperty", "Unknown Error");
		}

		String requestUrl = (String) request.getAttribute("javax.servlet.error.request_uri");
		if (requestUrl == null) {
			requestUrl = "Unknown";
		}

		mav.addObject("statusCode", statusCode);
		mav.addObject("requestUrl", requestUrl);
		return mav;
	}
    
}
