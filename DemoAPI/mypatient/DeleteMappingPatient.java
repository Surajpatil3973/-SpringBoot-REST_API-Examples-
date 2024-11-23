package com.jbk.DemoAPI.mypatient;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patient")
public class DeleteMappingPatient {

	@DeleteMapping("/deletepatient")
	public String DeleteAPI() {
		return "delete Patient Information";
	}
}
