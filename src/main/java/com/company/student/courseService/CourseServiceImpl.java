package com.company.student.courseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.student.dao.CourseRepository;
import com.company.student.model.Course;

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
