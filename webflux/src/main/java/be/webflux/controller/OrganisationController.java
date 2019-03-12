package be.webflux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import be.webflux.domain.Organisation;
import be.webflux.services.OrganisationService;

@RestController
public class OrganisationController {

	@Autowired
	OrganisationService organisationService;
	
	@RequestMapping("/test")
	@ResponseBody
	String test() {
		System.out.println("in test");
		Organisation orga = new Organisation();
		orga.setName("test1");
		orga.setCodeFase("code1");
		organisationService.create(orga);
		return "youpla";
	}
	
	
}
