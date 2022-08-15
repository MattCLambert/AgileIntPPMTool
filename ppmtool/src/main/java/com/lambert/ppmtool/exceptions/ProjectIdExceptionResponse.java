package com.lambert.ppmtool.exceptions;

public class ProjectIdExceptionResponse {
	//"projectIdentifier": "Project Identifier is required"
	private String projectIdentifier;
	public ProjectIdExceptionResponse(String projectIdentifier)
	{
		this.projectIdentifier = projectIdentifier;
	}
	public String getProjectIdentifier() {
		return projectIdentifier;
	}
	public void setProjectIdentifier(String projectIdentifier) {
		this.projectIdentifier = projectIdentifier;
	}
	
	
}
