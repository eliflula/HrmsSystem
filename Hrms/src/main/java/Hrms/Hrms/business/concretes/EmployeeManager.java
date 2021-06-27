package Hrms.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.Hrms.business.abstratcs.EmployeeService;
import Hrms.Hrms.core.results.DataResult;
import Hrms.Hrms.core.results.SuccessDataResult;
import Hrms.Hrms.dataAccess.abstratcs.EmployeeDao;
import Hrms.Hrms.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService {
  private EmployeeDao employeeDao;
  
   @Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
	super();
	this.employeeDao = employeeDao;
}
	@Override
	public DataResult<List<Employee>> getAll() {
		return new SuccessDataResult<List<Employee>>(this.employeeDao.findAll());
		
	}

}
