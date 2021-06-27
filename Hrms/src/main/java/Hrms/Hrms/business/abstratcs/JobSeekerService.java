package Hrms.Hrms.business.abstratcs;

import java.util.List;

import Hrms.Hrms.core.results.DataResult;
import Hrms.Hrms.entities.concretes.JobSeeker;

public interface JobSeekerService {
	DataResult<List<JobSeeker>> getAll();
	DataResult<List<JobSeeker>> findByIdentityNumber(String identityNumber);
	DataResult<List<JobSeeker>> findByEmail(String email);
	


}
