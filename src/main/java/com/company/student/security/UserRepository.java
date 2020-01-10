package com.company.student.security;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.student.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	Optional<User> findByUserName(String userName);
	
}
