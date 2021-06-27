package Hrms.Hrms.dataAccess.abstratcs;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Hrms.Hrms.entities.concretes.JobAdvert;

public interface JobAdvertDao extends JpaRepository<JobAdvert, Integer> {
	//aktif ilanlar
	
   List<JobAdvert> findByActiveTrue();
   
   List<JobAdvert> findByActiveTrueOrderByCreatedTime();
   
   List<JobAdvert> findByActiveTrueAndEmployer_CompanyName(String companyName);
   
   JobAdvert findByIdAndActiveTrue(int id);
   //pasif ilan olduğu için böyle yazdık
	

}
