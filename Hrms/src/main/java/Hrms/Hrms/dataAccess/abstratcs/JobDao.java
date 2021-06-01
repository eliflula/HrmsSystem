package Hrms.Hrms.dataAccess.abstratcs;

import org.springframework.data.jpa.repository.JpaRepository;

import Hrms.Hrms.entities.concretes.JobPosition;

public interface JobDao extends JpaRepository<JobPosition, Integer> {
	

}
