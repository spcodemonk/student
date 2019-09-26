package com.company.student.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.student.dao.StudentRepository;
import com.company.student.model.Student;


public interface StudentService {

	public List<Student> getStudentsList();

	public Student createStudent(Student student);

	public List<Student> getStudent(int id);

}