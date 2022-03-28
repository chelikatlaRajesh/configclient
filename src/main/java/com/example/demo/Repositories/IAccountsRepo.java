package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Accounts;

@Repository
public interface IAccountsRepo extends JpaRepository<Accounts, String>{

}
