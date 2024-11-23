package com.jbk.DemoAPI.mycontroller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/w3school")
public class MyController {

	@RequestMapping(value = "/python", method = RequestMethod.GET)
	public String FirstAPI() {
		return "python is the simple language";
	}

	@PostMapping("/java")
	public String SeconfAPI() {
		return "java is the object oriented language";
	}

	@PutMapping("/javascript")
	public String ThirdAPI() {
		return "javascript is the frontend language";
	}

	@DeleteMapping("/mysql")
	public String FourthAPI() {
		return "mysql is the database language";
	}
}
