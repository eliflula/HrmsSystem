package Hrms.Hrms.business.abstratcs;

import java.util.List;

import Hrms.Hrms.core.results.DataResult;
import Hrms.Hrms.core.results.Result;
import Hrms.Hrms.entities.concretes.Employer;

public interface EmployerService {
	 DataResult<List<Employer>> getAll();
	  DataResult<List<Employer>> findByEmail(String email);
	  
	  Result add(Employer employer);
	  
	

}
