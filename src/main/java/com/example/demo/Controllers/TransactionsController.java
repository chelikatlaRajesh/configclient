package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ServiceImpl.TransactinsImpl;
import com.example.demo.entities.Transactions;

@RestController
@RequestMapping("transaction")
public class TransactionsController {

	@Autowired	
	private TransactinsImpl impl;
	
	@PostMapping("/save")
	public Transactions save(@RequestBody Transactions t) {
		return impl.save(t);
		
	}
}
