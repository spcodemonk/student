package com.company.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.student.model.Address;
import com.company.student.service.AddressService;

@RestController
@RequestMapping("/addr")
public class AddressController {

	@Autowired
	AddressService addressService; 
	
	@PostMapping("/addAdr")
	public String saveAddress(@RequestBody Address addr) {
		
		Address ad = addressService.saveAddress(addr);
		
		return "Address has been created successfullys : "+ad.getId();
	}
}
