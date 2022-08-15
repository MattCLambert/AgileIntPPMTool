package com.lambert.ppmtool.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lambert.ppmtool.domain.Project;
import com.lambert.ppmtool.exceptions.ProjectIdException;
import com.lambert.ppmtool.repository.ProjectRepository;

@Service
public class ProjectService {
	@Autowired
	private ProjectRepository projectRepository;
	
	public Project saveOrUpdateProject(Project project)
	{
		try
		{
			project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
			return projectRepository.save(project);
		} catch( Exception e)
		{
			throw new ProjectIdException("Project ID '"+project.getProjectIdentifier().toUpperCase()+"' already exists");
		}
		
	}
	public Project findProjectByIdentifier(String projectId)
	{
		Project project = projectRepository.findByProjectIdentifier(projectId.toUpperCase());
		
		if(project == null)
		{
			throw new ProjectIdException("Project ID "+projectId +" does not exist");

		}
		return project;
	}
}
