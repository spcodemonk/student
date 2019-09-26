package com.company.student.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.company.student.model.Student;
import com.company.student.service.StudentService;

@RestController
@RequestMapping("/stcntr/*")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping("/getstudents")
	public List<Student> getName() {
		
		List<Student> list = studentService.getStudentsList();
		
		return list;
		
	}
	
	@PostMapping("/createStudent")
	public String saveStudentRecord(@RequestBody Student student) {
		
		String msg="";
		Student s = studentService.createStudent(student);
		if (s != null) {
			msg = "Student have been created successfully : "+ student.getName();
		}
		return msg;
	}
	@GetMapping("/getStudent")
	public List<Student> getStudent(@RequestParam int id){
		
		List<Student> list = studentService.getStudent(id);
		
		return list;
	}
		
}
