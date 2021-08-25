package com.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFound extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String resourceName;

	private String feildName;

	private Object feildValue;

	public ResourceNotFound(String resourceName, String feildName, Object feildValue) {
		super(String.format("%s not found with %s  : '%s'", resourceName, feildName, feildValue));
		this.resourceName = resourceName;
		this.feildName = feildName;
		this.feildValue = feildValue;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public void setFeildName(String feildName) {
		this.feildName = feildName;
	}

	public void setFeildValue(Object feildValue) {
		this.feildValue = feildValue;
	}

}
