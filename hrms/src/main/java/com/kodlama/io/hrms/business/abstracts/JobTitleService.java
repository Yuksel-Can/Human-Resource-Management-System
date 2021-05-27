package com.kodlama.io.hrms.business.abstracts;

import java.util.List;

import com.kodlama.io.hrms.core.utilities.results.DataResult;
import com.kodlama.io.hrms.entities.concrete.JobTitle;

public interface JobTitleService {
	
	DataResult<List<JobTitle>> getAll();
	

}
