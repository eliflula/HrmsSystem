package Hrms.Hrms.business.abstratcs;

import java.util.List;

import Hrms.Hrms.core.results.DataResult;
import Hrms.Hrms.core.results.Result;
import Hrms.Hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	
	DataResult<List<JobPosition>> getAll();
	
	Result add(JobPosition jobPosition);
	
	DataResult<List<JobPosition>> findByTitle(String title);
	
	

}
