package com.company.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.student.model.Course;
import com.company.student.service.CourseService;

@RestController
@RequestMapping("/course/*")
public class CourseController {

	@Autowired
	CourseService courseService; 
	
	@PostMapping("/createcourse")
	public String createCourse(@RequestBody Course course) {
		
		courseService.createCourse(course);
		
		return "Course have been added successfully";
	}
	
}
