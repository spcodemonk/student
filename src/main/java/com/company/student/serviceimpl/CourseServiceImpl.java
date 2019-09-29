package com.company.student.serviceimpl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.student.model.Course;
import com.company.student.repository.CourseRepository;
import com.company.student.service.CourseService;


@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	CourseRepository courseRepository;
	
	@Override
	public Course createCourse(Course course) {
		
		course = courseRepository.save(course);
		
		return course;
	}

}
