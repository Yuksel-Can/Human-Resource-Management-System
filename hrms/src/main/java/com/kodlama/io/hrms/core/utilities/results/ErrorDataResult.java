package com.kodlama.io.hrms.core.utilities.results;

public class ErrorDataResult<T> extends DataResult<T>{
	
	public ErrorDataResult() {
		super(false,null);
	}
	public ErrorDataResult(String message) {
		super(false,message,null);
	}
	public ErrorDataResult(T data) {
		super(false,data);
	}
	public ErrorDataResult(String message, T data) {
		super(false, message, data);
	}

}
