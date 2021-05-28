package com.kodlama.io.hrms.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlama.io.hrms.business.abstracts.CandidateService;
import com.kodlama.io.hrms.core.utilities.results.DataResult;
import com.kodlama.io.hrms.core.utilities.results.Result;
import com.kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import com.kodlama.io.hrms.core.utilities.results.SuccessResult;
import com.kodlama.io.hrms.dataAccess.abstracts.CandidateDao;
import com.kodlama.io.hrms.entities.concrete.Candidate;

@Service
public class CandidateManager implements CandidateService{

	private CandidateDao candidateDao;
	
	@Autowired
	public CandidateManager(CandidateDao candidateDao) {
		this.candidateDao = candidateDao;
	}
	@Override
	public DataResult<List<Candidate>> getAll() {

		return new SuccessDataResult<List<Candidate>>("İş Adayları başarıyla listelendi", this.candidateDao.findAll());
	}

	@Override
	public Result add(Candidate candidate) {
		this.candidateDao.save(candidate);
		return new SuccessResult("İş Adayı başarıyla eklendi");
	}

}
