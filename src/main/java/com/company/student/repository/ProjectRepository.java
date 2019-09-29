package com.company.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.student.model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, String> {

}
