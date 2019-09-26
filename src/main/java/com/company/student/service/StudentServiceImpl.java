package com.company.student.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.student.dao.StudentRepository;
import com.company.student.model.Student;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository studentRepository;
	
	public List<Student> getStudentsList() {

		List<Student> students = new ArrayList<>();
		
		students = studentRepository.findAll();
	
		return students;
	}

	@Override
	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		
		Student s = studentRepository.save(student);
		return s;
		
		
	}

	@Override
	public List<Student> getStudent(int id) {
		List<Student> students = new ArrayList<>();
		
		Student student = studentRepository.findById(id).get();
		students.add(student);
		return students;
	}
	
 
}
