package Hrms.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.Hrms.business.abstratcs.JobSeekerService;
import Hrms.Hrms.dataAccess.abstratcs.JobSeekerDao;

import Hrms.Hrms.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService {
	private JobSeekerDao jobSeekerDao;

	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao) {
		super();
		this.jobSeekerDao = jobSeekerDao;
	}

	@Override
	public List<JobSeeker> getAll() {
		
		return  this.jobSeekerDao.findAll();
	}

	@Override
	public List<JobSeeker> findByIdentityNumber(String identityNumber) {
		
		return this.jobSeekerDao.findByIdentityNumber(identityNumber);
	}

	@Override
	public List<JobSeeker> findByEmail(String email) {
		
		return this.jobSeekerDao.findByEmail(email);
	}

	

}
