package com.company.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.company.student.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

	List<Student> findByCategory(String category);
	
	@Query("from Student where category=?1 order by id desc")
	List<Student> findByCategorySortedDesc(String category);



	
	
}
