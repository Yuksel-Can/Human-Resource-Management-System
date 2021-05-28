package com.kodlama.io.hrms.business.abstracts;

import java.util.List;

import com.kodlama.io.hrms.core.utilities.results.DataResult;
import com.kodlama.io.hrms.core.utilities.results.Result;
import com.kodlama.io.hrms.entities.concrete.Candidate;

public interface CandidateService {

	DataResult<List<Candidate>> getAll();
	
	Result add(Candidate candidate);
	
}
