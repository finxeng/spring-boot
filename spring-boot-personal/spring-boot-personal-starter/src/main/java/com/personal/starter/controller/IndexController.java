package com.personal.starter.controller;

import com.personal.starter.simple.placeholder.PlaceholderBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	@Autowired
	PlaceholderBean placeholderBean;

	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public String index(){
		return placeholderBean.getName();
	}
}
