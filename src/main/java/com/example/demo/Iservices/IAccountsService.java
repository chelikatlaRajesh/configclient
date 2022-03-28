package com.example.demo.Iservices;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Accounts;

@Service
public interface IAccountsService {

	
	public abstract Accounts save(Accounts a);
	
}
