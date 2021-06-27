package Hrms.Hrms.business.abstratcs;

import java.util.List;

import Hrms.Hrms.core.results.DataResult;
import Hrms.Hrms.entities.concretes.City;

public interface CityService {
	
	DataResult<List<City>> getAll();
}
