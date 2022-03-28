package com.example.demo.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Iservices.ITransactionsService;
import com.example.demo.Repositories.ITransactionsRepo;
import com.example.demo.entities.Transactions;

@Service
public class TransactinsImpl implements ITransactionsService {

	@Autowired
	private ITransactionsRepo repo;

	@Override
	public Transactions save(Transactions t) {
		// TODO Auto-generated method stub
		return repo.save(t);
	}
}
