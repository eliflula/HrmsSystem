package Hrms.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.Hrms.business.abstratcs.JobSeekerService;
import Hrms.Hrms.core.results.DataResult;
import Hrms.Hrms.core.results.SuccessDataResult;
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
	public DataResult<List<JobSeeker>> getAll() {
		
		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(),"Listelendi");
	}

	@Override
	public DataResult<List<JobSeeker>> findByIdentityNumber(String identityNumber) {
		
		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findByIdentityNumber(identityNumber),"TC");
		
	}

	@Override
	public DataResult<List<JobSeeker>> findByEmail(String email) {
		
		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findByEmail(email));
	}

	

}
