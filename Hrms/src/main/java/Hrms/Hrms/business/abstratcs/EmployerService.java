package Hrms.Hrms.business.abstratcs;

import java.util.List;

import Hrms.Hrms.entities.concretes.Employer;

public interface EmployerService {
	  List<Employer> getAll();
	  List<Employer> findByEmail(String email);
	

}
