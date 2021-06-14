package Hrms.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.Hrms.business.abstratcs.EmployerService;
import Hrms.Hrms.dataAccess.abstratcs.EmployerDao;
import Hrms.Hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {
	private EmployerDao employerDao;

	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public List<Employer> getAll() {
		
		return this.employerDao.findAll();
	}

	@Override
	public List<Employer> findByEmail(String email) {
		
		return this.employerDao.findByEmail(email);
	}

}
