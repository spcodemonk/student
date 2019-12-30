package com.company.student.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.company.student.model.Student;
import com.company.student.service.StudentService;

import io.swagger.annotations.ResponseHeader;

@RestController
@RequestMapping("/stcntr/*")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	

	
	Logger logger = LoggerFactory.getLogger(StudentController.class);
	
	
	@GetMapping("/getstudents")
	public List<Student> getName() {
		
		logger.info("Returning student list");
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
	
	@GetMapping("/findbyCat")
	public List<Student> getStudentsByCategory(@RequestParam("cat") String category){
		
		List<Student> list = studentService.getStudentsByCategory(category);

		return list;
	}
		
	@GetMapping("/movies")
	public ResponseEntity<Set<String>> getMovieTitles(){
		
		Set<String> data = studentService.getTitles();
		System.out.println(data);
		return new ResponseEntity<Set<String>>(data, HttpStatus.OK);
	}
}
