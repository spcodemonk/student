package com.company.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.student.model.Address;
@Repository
public interface AddressRepository extends JpaRepository<Address, String> {

}
