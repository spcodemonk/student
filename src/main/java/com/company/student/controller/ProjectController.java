package com.company.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.student.model.Project;
import com.company.student.service.ProjectService;

@RestController
@RequestMapping("/project")
public class ProjectController {
	@Autowired
	ProjectService projectService;

	@PostMapping("/addproj")
	public String addProject(@RequestBody Project project) {
		
		projectService.addProject(project);
		return "";
	}
}
