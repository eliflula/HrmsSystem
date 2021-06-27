package Hrms.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import Hrms.Hrms.business.abstratcs.JobPositionService;
import Hrms.Hrms.core.results.DataResult;
import Hrms.Hrms.core.results.Result;
import Hrms.Hrms.core.results.SuccessDataResult;
import Hrms.Hrms.core.results.SuccessResult;
import Hrms.Hrms.dataAccess.abstratcs.JobPositionDao;
import Hrms.Hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {

	private JobPositionDao jobDao;
	
	@Autowired
	
	public JobPositionManager(JobPositionDao jobDao) {
		super();
		this.jobDao = jobDao;
	}
	@Override
	public DataResult<List<JobPosition>> getAll() {
		
		return new SuccessDataResult<List<JobPosition>>(this.jobDao.findAll());
		
		// tüm datayı getirme
	}
	@Override
	public Result add(@RequestBody    JobPosition jobPosition) {
	    this.jobDao.save(jobPosition);
		return new SuccessResult("Meslekler Eklendi");
		//EKLEME OLDUĞU İÇİN SUCCESS RESULT 
		
	}
	@Override
	public DataResult<List<JobPosition>> findByTitle(@RequestParam  String title) {
		
		return new SuccessDataResult<List<JobPosition>>(this.jobDao.findByTitle(title),"Meslek İsimleri Listelendi");
	}

}
