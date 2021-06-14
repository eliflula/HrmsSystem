package Hrms.Hrms.dataAccess.abstratcs;

import org.springframework.data.jpa.repository.JpaRepository;

import Hrms.Hrms.entities.concretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
