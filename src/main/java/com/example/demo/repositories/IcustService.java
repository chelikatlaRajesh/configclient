package com.example.demo.repositories;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.pojo.*;
@Service
public interface IcustService {

	public abstract Customer register(Customer c);
	
	public void delete(Integer cid);
	
	public Customer getcustdetails(@PathVariable Integer cid);
	
	public List<Customer>findall();
}
