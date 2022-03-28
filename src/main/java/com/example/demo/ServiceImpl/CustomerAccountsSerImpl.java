package com.example.demo.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Iservices.ICustomerAccountsService;

import com.example.demo.Repositories.ICustomerAccountsReo;
import com.example.demo.entities.CustomerAccounts;

@Service
public class CustomerAccountsSerImpl implements ICustomerAccountsService {

	
	@Autowired
	private ICustomerAccountsReo repo;

	@Override
	public CustomerAccounts save(CustomerAccounts c) {
		// TODO Auto-generated method stub
		return repo.save(c);
	}
	
	
	

	@Override
	public CustomerAccounts DepositBYAccountnumber(Integer accountnumber, Integer depositAmount,double balance) {
		
		CustomerAccounts c=new CustomerAccounts();
		c.setAccountnumber(accountnumber);
		
		c.setBalance(balance+depositAmount);
		
		return c;
		
	}




	@Override
	public CustomerAccounts checkbalanceByid(Integer accountnumber) {
		CustomerAccounts c=new CustomerAccounts();
		
		return c;
		
		// TODO Auto-generated method stub
		
	}}
