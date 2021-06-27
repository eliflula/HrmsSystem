package Hrms.Hrms.business.abstratcs;

import java.util.List;

import Hrms.Hrms.core.results.DataResult;
import Hrms.Hrms.core.results.Result;
import Hrms.Hrms.entities.concretes.JobAdvert;

public interface JobAdvertService {
	
	DataResult<List<JobAdvert>> getAll();
	
	Result add(JobAdvert jobAdvert);
	
	DataResult<List<JobAdvert>> findByActiveTrue();
	
	DataResult<List<JobAdvert>> findByActiveTrueOrderByCreatedTime();
	
	DataResult<List<JobAdvert>> findByActiveTrueAndEmployer_CompanyName(String companyName);
	
	DataResult<JobAdvert> findByIdAndActiveTrue(int id);
	 
	 

}
