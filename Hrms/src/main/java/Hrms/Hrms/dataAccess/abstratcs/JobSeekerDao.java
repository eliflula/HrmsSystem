package Hrms.Hrms.dataAccess.abstratcs;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Hrms.Hrms.entities.concretes.JobSeeker;

public interface JobSeekerDao extends JpaRepository<JobSeeker, Integer> {
	
	List<JobSeeker> findByIdentityNumber(String identityNumber);
	List<JobSeeker> findByEmail(String email);

}
