package Hrms.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Hrms.Hrms.business.abstratcs.JobAdvertService;
import Hrms.Hrms.core.results.DataResult;
import Hrms.Hrms.core.results.Result;
import Hrms.Hrms.entities.concretes.JobAdvert;

 

@RestController
// apide işlemleri kontrölü 

@RequestMapping("/api/titles")

// dış dünyadan api/ titles isteği gelirse jobscontrollers kontrol edicek
public class JobAdvertsControllers {
	
	
	private JobAdvertService jobAdvertService;
	
	@Autowired
    public JobAdvertsControllers(JobAdvertService jobAdvertService) {
		super();
		this.jobAdvertService = jobAdvertService;
	}

	@GetMapping("/getAll")
    public DataResult<List<JobAdvert>> getAll(){
		return this.jobAdvertService.getAll();
    	
    }
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvert jobAdvert) {
		return this.jobAdvertService.add(jobAdvert);
	}

	@GetMapping("/findByActiveTrue")
    public DataResult<List<JobAdvert>> findByActiveTrue(){
		return this.jobAdvertService.findByActiveTrue();
	
}
	
	@GetMapping("/findByActiveTrueOrderByCreatedTime")
	public DataResult<List<JobAdvert>> findByActiveTrueOrderByCreatedTime(){
		return this.jobAdvertService.findByActiveTrueOrderByCreatedTime();
	}
	
	@GetMapping("/findByActiveTrueAndEmployer_CompanyName")
	public DataResult<List<JobAdvert>> findByActiveTrueAndEmployer_CompanyName(String companyName){
		
		return this.jobAdvertService.findByActiveTrueAndEmployer_CompanyName(companyName);
		
	}
	
	@GetMapping("/findByIdAndActiveTrue")
	public DataResult<JobAdvert> findByIdAndActiveTrue(@RequestParam  int id){
		
		return this.jobAdvertService.findByIdAndActiveTrue(id);
	}
	 
    	
		
		
		
		
		
	}


