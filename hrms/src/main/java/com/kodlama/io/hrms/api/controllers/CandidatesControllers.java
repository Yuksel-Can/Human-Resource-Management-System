package com.kodlama.io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodlama.io.hrms.business.abstracts.CandidateService;
import com.kodlama.io.hrms.core.utilities.results.DataResult;
import com.kodlama.io.hrms.core.utilities.results.Result;
import com.kodlama.io.hrms.entities.concrete.Candidate;

@RestController
@RequestMapping("/api/candidate")
public class CandidatesControllers {

	private CandidateService candidateService;
	
	@Autowired
	public CandidatesControllers(CandidateService candidateService) {
		this.candidateService = candidateService;
	}
	
	@GetMapping(name="/getall")
	DataResult<List<Candidate>> getAll(){
		return candidateService.getAll();
	}
	@PostMapping(name="/add")
	Result add(@RequestBody Candidate candidate) {
		return candidateService.add(candidate);
	}
}
