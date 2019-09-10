package com.company.student.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.student.dao.StudentRepository;
import com.company.student.model.Student;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	public List<Student> getStudentsList() {

		List<Student> students = new ArrayList<>();
		
		Student st = studentRepository.findById(001).get();
		
		
		students.add(st);
		
		return students;
	}

}