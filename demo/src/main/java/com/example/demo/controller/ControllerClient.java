package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerClient {

	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}
	@RequestMapping(value = "/")
	public String addClient() {
		return "addClient";
	}
}
