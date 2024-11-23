package com.jbk.DemoAPI.mypatient;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patient")
public class PutMappingPatient {

	@PutMapping("/update")
	public String UpdateAPI() {
		return "Update the Information Of Patient...!";
	}
}
