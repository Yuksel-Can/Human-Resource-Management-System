package com.kodlama.io.hrms.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlama.io.hrms.business.abstracts.EmployerService;
import com.kodlama.io.hrms.core.utilities.results.DataResult;
import com.kodlama.io.hrms.core.utilities.results.Result;
import com.kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import com.kodlama.io.hrms.core.utilities.results.SuccessResult;
import com.kodlama.io.hrms.dataAccess.abstracts.EmployerDao;
import com.kodlama.io.hrms.dataAccess.abstracts.JobTitleDao;
import com.kodlama.io.hrms.entities.concrete.Employer;

@Service
public class EmployerManager implements EmployerService{

	
	private EmployerDao employerDao;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		this.employerDao = employerDao;
	}

	@Override
	public DataResult<List<Employer>> getAll() {

		return new SuccessDataResult<List<Employer>> ("İş verenler başarıyla listelendi", this.employerDao.findAll());
	}

	@Override
	public Result add(Employer employer) {

		this.employerDao.save(employer);
		return new SuccessResult("İş veren barıyla eklendi");
	}

}
