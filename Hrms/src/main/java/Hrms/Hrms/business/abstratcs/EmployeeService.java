package Hrms.Hrms.business.abstratcs;

import java.util.List;

import Hrms.Hrms.core.results.DataResult;
import Hrms.Hrms.entities.concretes.Employee;

public interface EmployeeService {

	DataResult<List<Employee>> getAll();
}
