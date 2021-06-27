package Hrms.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.Hrms.business.abstratcs.EmployerService;
import Hrms.Hrms.core.results.DataResult;
import Hrms.Hrms.core.results.Result;
import Hrms.Hrms.core.results.SuccessDataResult;
import Hrms.Hrms.core.results.SuccessResult;
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
	public DataResult<List<Employer>> getAll() {
		
	return new SuccessDataResult<List<Employer>>(this.employerDao.findAll());
	}

	@Override
	public DataResult<List<Employer>> findByEmail(String email) {
		
		return new SuccessDataResult<List<Employer>>(this.employerDao.findByEmail(email));
	}

	@Override
	public Result add(Employer employer) {
		this.employerDao.save(employer);
		return new SuccessResult("Eklendi");
	}

}
