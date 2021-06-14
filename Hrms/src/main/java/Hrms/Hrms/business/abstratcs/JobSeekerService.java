package Hrms.Hrms.business.abstratcs;

import java.util.List;

import Hrms.Hrms.entities.concretes.JobSeeker;

public interface JobSeekerService {
	List<JobSeeker> getAll();
	List<JobSeeker> findByIdentityNumber(String identityNumber);
	List<JobSeeker> findByEmail(String email);
	


}
