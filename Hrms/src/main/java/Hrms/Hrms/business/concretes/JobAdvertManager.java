package Hrms.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.Hrms.business.abstratcs.JobAdvertService;
import Hrms.Hrms.core.results.DataResult;
import Hrms.Hrms.core.results.Result;
import Hrms.Hrms.core.results.SuccessDataResult;
import Hrms.Hrms.core.results.SuccessResult;
import Hrms.Hrms.dataAccess.abstratcs.JobAdvertDao;
import Hrms.Hrms.entities.concretes.JobAdvert;


@Service
public class JobAdvertManager implements JobAdvertService {
	private JobAdvertDao jobAdvertDao;
	
    @Autowired
	public JobAdvertManager(JobAdvertDao jobAdvertDao) {
		super();
		this.jobAdvertDao = jobAdvertDao;
	}

	@Override
	public DataResult<List<JobAdvert>> getAll() {
		
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.findAll());
	}

	@Override
	public Result add(JobAdvert jobAdvert) {
		this.jobAdvertDao.save(jobAdvert);
		return new SuccessResult("İlanlar Başarıyla Eklendi");
	}

	@Override
	public DataResult<List<JobAdvert>> findByActiveTrue() {
		
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.findByActiveTrue());
	}

	@Override
	public DataResult<List<JobAdvert>> findByActiveTrueOrderByCreatedTime() {
		
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.findByActiveTrueOrderByCreatedTime());
	}

	@Override
	public DataResult<List<JobAdvert>> findByActiveTrueAndEmployer_CompanyName(String companyName) {
		
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.findByActiveTrueAndEmployer_CompanyName(companyName));
	}

	@Override
	public DataResult<JobAdvert> findByIdAndActiveTrue(int id) {
		
		return new SuccessDataResult<JobAdvert>(this.jobAdvertDao.findByIdAndActiveTrue(id));
	}

}
