package com.company.student.serviceimpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.company.student.model.Student;
import com.company.student.moviesClient.MovieClient;
import com.company.student.moviesClient.Movies;
import com.company.student.repository.StudentRepository;
import com.company.student.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Autowired
	MovieClient moviesClient;

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

	@Override
	public List<Student> getStudentsByCategory(String category) {
		List<Student> students = new ArrayList<>();

//		 students = studentRepository.findByCategory(category);

		students = studentRepository.findByCategorySortedDesc(category);

		return students;
	}

	@Override
	public Set<String> getTitles() {
		int page=1;
		Set<String> list = new HashSet<>();
		Movies movieData = moviesClient.getMoviesData(page);
		List<String> al = null;
		if(!movieData.getData().isEmpty()) {
			al = movieData.getData().stream().map(Obj -> Obj.getTitle()).collect(Collectors.toList());
			list.addAll(al);
//			movieData = moviesClient.getMoviesData(++page);
		}
		
		
		System.out.println(list);

		return list;

	}

}
