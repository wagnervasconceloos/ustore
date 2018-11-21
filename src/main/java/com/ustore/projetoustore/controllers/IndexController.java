package com.ustore.projetoustore.controllers;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ComponentScan(basePackages= {"projetoustore.*"})
public class IndexController {

	@RequestMapping(method=RequestMethod.GET, value= "/index")
	public String index() {
		return "index";
	}

}
