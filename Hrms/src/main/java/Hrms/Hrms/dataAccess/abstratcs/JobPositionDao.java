package Hrms.Hrms.dataAccess.abstratcs;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Hrms.Hrms.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer> {
	
	List<JobPosition> findByTitle(String title);
	

}
