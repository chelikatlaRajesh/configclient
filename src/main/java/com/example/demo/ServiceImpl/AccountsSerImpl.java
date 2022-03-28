package com.example.demo.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Iservices.IAccountsService;
import com.example.demo.Repositories.IAccountsRepo;
import com.example.demo.entities.Accounts;

@Service
public class AccountsSerImpl implements IAccountsService {

	@Autowired
	private IAccountsRepo repo;
	
	
	

	@Override
	public Accounts save(Accounts a) {
		// TODO Auto-generated method stub
		return repo.save(a);
	}
	
}
