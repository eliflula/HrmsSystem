package Hrms.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Hrms.Hrms.business.abstratcs.JobSeekerService;
import Hrms.Hrms.entities.concretes.JobSeeker;

@RestController
@RequestMapping("/api/jobseekers")
public class JobSeekersController {
	private JobSeekerService jobSeekerService;

	@Autowired
	public JobSeekersController(JobSeekerService jobSeekerService) {
		super();
		this.jobSeekerService = jobSeekerService;
	}
	public List<JobSeeker> getAll(){
		return this.jobSeekerService.getAll();
	}
	public List<JobSeeker> findByIdentityNumber(String identityNumber){
		return this.jobSeekerService.findByIdentityNumber(identityNumber);
	}
	public List<JobSeeker> findByEmail(String email){
		return this.jobSeekerService.findByEmail(email);
	}

}
