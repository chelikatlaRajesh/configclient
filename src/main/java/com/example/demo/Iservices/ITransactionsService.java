package com.example.demo.Iservices;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Transactions;

@Service
public interface ITransactionsService {

	public  abstract Transactions save(Transactions t);
	
	
}
