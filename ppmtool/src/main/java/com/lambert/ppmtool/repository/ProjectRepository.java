package com.lambert.ppmtool.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lambert.ppmtool.domain.Project;
@Repository
public interface ProjectRepository extends CrudRepository<Project,Long>{
	@Override
	Iterable<Project> findAll();


	Project findByProjectIdentifier(String projectId);
}
