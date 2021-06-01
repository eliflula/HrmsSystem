package Hrms.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Hrms.Hrms.business.abstratcs.JobPositionService;
import Hrms.Hrms.entities.concretes.JobPosition;
 

@RestController
// apide işlemleri kontrölü 
@RequestMapping("/api/titles")
// dış dünyadan api/ titles isteği gelirse jobscontrollers kontrol edicek
public class JobsControllers {
	
	private JobPositionService jobPositionService;
	
    @Autowired
    // otomatik dolaşma
	public JobsControllers(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
    }
    @GetMapping("/getall")
    public List<JobPosition> getAll(){
    	return this.jobPositionService.getAll();
		
		
		
		
		
		
	}

}
