package Hrms.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Hrms.Hrms.business.abstratcs.EmployerService;
import Hrms.Hrms.entities.concretes.Employer;

@RestController
@RequestMapping("/api/employers")
public class EmployersController {
	private EmployerService employerService;

	@Autowired
	public EmployersController(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}
	 @GetMapping("/getAll")
	 public List<Employer> getAll(){
		 return this.employerService.getAll();
	 }
	 @GetMapping("/findByEmail")
	public List<Employer>findByEmail(String email){
		 return this.employerService.findByEmail(email);
	 }

}
