package com.example.demo.Serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.pojo.*;
import com.example.demo.repositories.ICustomerRepository;
import com.example.demo.repositories.IcustService;

@Service
public class custserviceimpl implements IcustService {
@Autowired
	private ICustomerRepository repo;
	
	@Override
	public Customer register(Customer c) {
		// TODO Auto-generated method stub
		return repo.save(c);
	}

	@Override
	public void delete(Integer cid) {
		repo.deleteById(cid);
		
	}

	@Override
	public Customer getcustdetails(Integer cid) {
		// TODO Auto-generated method stub
	Optional<Customer> c= repo.findById(cid);
		if(c.isPresent()) {
		return	c.get();
		}else {
			return null;
		}
	}

	@Override
	public List<Customer> findall() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
