package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ServiceImpl.AccountsSerImpl;
import com.example.demo.entities.Accounts;

@RestController
@RequestMapping("Accounts")
public class AccountsController {

	
	@Autowired
	private AccountsSerImpl ser;
	
	
	@PostMapping("/save")
	public Accounts save(@RequestBody Accounts a) {
		Accounts a1=ser.save(a);
			return a1;
		
	}
	
	
	
}
