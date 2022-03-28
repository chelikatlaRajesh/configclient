package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Serviceimpl.custserviceimpl;
import com.example.demo.pojo.Customer;

@RestController
@RequestMapping("Cust")
public class CustController {
@Autowired
	private custserviceimpl impl;
	
	@PostMapping("/registration")
	public ResponseEntity<Customer>SaveCustomer(@RequestBody Customer c){
		Customer c1=impl.register(c);
		ResponseEntity<Customer>rs=new ResponseEntity<Customer>(c1, HttpStatus.OK);
		return rs;
		
		
	}
	@GetMapping("delete/cid/{cid}")
	public void delete(@PathVariable Integer cid) {
		impl.delete(cid);
		
	}
	
	@GetMapping("getcust/{cid}")
	public Customer getcustdetails(@PathVariable Integer cid) {
	
		 Customer c= impl.getcustdetails(cid);
		return c;
		
	}
	@GetMapping("findallCustomers")
public List<Customer>findall(){ 
	return impl.findall();
		
	}
	
}
