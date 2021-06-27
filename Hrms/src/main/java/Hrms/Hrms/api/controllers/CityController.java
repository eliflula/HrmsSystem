package Hrms.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Hrms.Hrms.business.abstratcs.CityService;
import Hrms.Hrms.core.results.DataResult;
import Hrms.Hrms.entities.concretes.City;

@RestController
@RequestMapping("/api/cities")

public class CityController {
 private CityService cityService;
@Autowired
public CityController(CityService cityService) {
	super();
	this.cityService = cityService;
}

@GetMapping("/getAll")
public DataResult<List<City>>getAll(){
	return this.cityService.getAll();
	
}





}
