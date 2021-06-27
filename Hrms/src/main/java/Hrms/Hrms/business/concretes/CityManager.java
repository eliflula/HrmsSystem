package Hrms.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.Hrms.business.abstratcs.CityService;
import Hrms.Hrms.core.results.DataResult;
import Hrms.Hrms.core.results.SuccessDataResult;
import Hrms.Hrms.dataAccess.abstratcs.CityDao;
import Hrms.Hrms.entities.concretes.City;
@Service


public class CityManager implements CityService{
    private CityDao cityDao;
    
    @Autowired
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}

	@Override
	public DataResult<List<City>> getAll() {
		return new SuccessDataResult<List<City>>(this.cityDao.findAll());
		
	}

}
