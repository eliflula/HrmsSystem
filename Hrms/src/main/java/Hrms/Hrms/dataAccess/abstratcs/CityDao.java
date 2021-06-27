package Hrms.Hrms.dataAccess.abstratcs;

import org.springframework.data.jpa.repository.JpaRepository;

import Hrms.Hrms.entities.concretes.City;

public interface CityDao extends JpaRepository<City, Integer> {

}
