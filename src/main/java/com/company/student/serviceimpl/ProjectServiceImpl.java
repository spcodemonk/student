package com.company.student.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.student.model.Project;
import com.company.student.repository.ProjectRepository;
import com.company.student.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService {
	
	@Autowired
	ProjectRepository projectRepository;
	
	@Override
	public Project addProject(Project project) {
		Project proj = projectRepository.save(project);
		
		return proj;
	}

}
