package com.example.demo.Iservices;

import org.springframework.stereotype.Service;
import com.example.demo.entities.CustomerAccounts;

@Service
public interface ICustomerAccountsService {

	public abstract CustomerAccounts save(CustomerAccounts c);
	
	public abstract CustomerAccounts DepositBYAccountnumber(Integer accountnumber, Integer depositAmount,double balance );
	
	public abstract CustomerAccounts checkbalanceByid(Integer accountnumber);
}
