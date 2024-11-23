package com.jbk.DemoAPI.mypatient;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patient")
public class PostMappingPatient {
	
	@PostMapping("/addpatient")
    public String FirstAPI() {
		return "Adding New Patient Details...!";
	}
}
