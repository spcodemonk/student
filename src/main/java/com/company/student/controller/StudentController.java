package com.company.student.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.student.model.Student;
import com.company.student.service.StudentService;

@RestController
@RequestMapping("/stcntr/*")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping("/getName")
	public List<Student> getName() {
		
		List<Student> list = studentService.getStudentsList();
		
		return list;
		
	}


	
}
