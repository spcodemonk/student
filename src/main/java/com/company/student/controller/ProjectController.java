package com.company.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.company.student.model.Project;
import com.company.student.service.ProjectService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/project")
@Api(value="Project COntroller", description="you will find project related operation in this controller ")
public class ProjectController {
	@Autowired
	ProjectService projectService;

	@RequestMapping(value="/addproj" , method =RequestMethod.POST, produces="application/json")
	@ApiOperation(value="you can create a project by just providing project date and compltetion year")
	public String addProject(@RequestBody Project project) {
		
		projectService.addProject(project);
		return "";
	}
}
