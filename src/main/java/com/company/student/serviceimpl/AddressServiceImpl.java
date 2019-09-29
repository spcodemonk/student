package com.company.student.serviceimpl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.student.model.Address;
import com.company.student.repository.AddressRepository;
import com.company.student.service.AddressService;;


@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	AddressRepository addressRepository;

	@Override
	public Address saveAddress(Address addr) {
		// TODO Auto-generated method stub

		Address ad = addressRepository.save(addr);

		return ad;
	}

}
