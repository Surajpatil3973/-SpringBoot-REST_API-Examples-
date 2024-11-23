package com.jbk.DemoAPI.mypatient;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patient")
public class GetMappingPatient {
	@RequestMapping(value = "/information", method = RequestMethod.GET)
	public String FirstAPI() {
		return "Totol Information of Patient...!";
	}

}
