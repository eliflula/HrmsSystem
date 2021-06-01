package Hrms.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hrms.Hrms.business.abstratcs.JobPositionService;
import Hrms.Hrms.dataAccess.abstratcs.JobDao;
import Hrms.Hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {

	private JobDao jobDao;
	
	@Autowired
	//
	public JobPositionManager(JobDao jobDao) {
		super();
		this.jobDao = jobDao;
	}
	@Override
	public List<JobPosition> getAll() {
		
		return this.jobDao.findAll();
		// tüm datayı getirme
	}

}
