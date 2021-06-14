package Hrms.Hrms.dataAccess.abstratcs;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Hrms.Hrms.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer> {
	
   List<Employer> findByEmail(String email);
}
