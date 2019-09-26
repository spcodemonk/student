package com.company.student.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.student.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer>{

}
