package Hrms.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Hrms.Hrms.business.abstratcs.JobPositionService;
import Hrms.Hrms.core.results.DataResult;
import Hrms.Hrms.core.results.Result;
import Hrms.Hrms.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/jobPositions")
public class JobPositionController   {
	private JobPositionService jobPositionService;
	
    @Autowired
	public JobPositionController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}
    
    @GetMapping("/getAll")
   public DataResult<List<JobPosition>> getAll(){
    	return this.jobPositionService.getAll();
	   
   }
    
	@PostMapping("/add")
	Result add(@RequestBody   JobPosition jobPosition) {
		return this.jobPositionService.add(jobPosition);
		//job positionda dolaşıp columsları ekliyor
		
	}
	
	DataResult<List<JobPosition>> findByTitle(@RequestParam  String title){
		return this.jobPositionService.findByTitle(title);
		
	}
	
	
	
	
	

}
