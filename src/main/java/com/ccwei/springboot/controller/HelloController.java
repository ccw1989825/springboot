package com.ccwei.springboot.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	public String helloWorld() {
		return "hello world again";
	}
	
	@RequestMapping(value = "/chinese", method = RequestMethod.POST)
	public String chinese() {
		return "你好：中文";
	}
	
	@RequestMapping(value = "/postParams", method = RequestMethod.POST)
	public String postParams(@RequestBody Map<String, String> params) {
		
		return params.toString();
	}
	
}
