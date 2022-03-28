package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Feign.IfiegnClientManager;
import com.example.demo.ServiceImpl.CustomerAccountsSerImpl;
import com.example.demo.entities.Customer;
import com.example.demo.entities.CustomerAccounts;

@RestController
@RequestMapping("CustomerAccounts")
public class CustomerAccountsController {

	@Autowired
	private CustomerAccountsSerImpl impl;
	
	@PostMapping("/save")
	public CustomerAccounts save(@RequestBody CustomerAccounts c) {
		  CustomerAccounts c1=  impl.save(c);
		return c1;
	}
	
	@Autowired
private IfiegnClientManager proxy;
	
	@GetMapping("/delete/{cid}")
	public void delete(@PathVariable Integer cid) {
		proxy.deletebyid(cid);
	}
	
	@GetMapping("/getcustomer/{cid}")
	public Customer getcustdetails(@PathVariable Integer cid) {
	Customer c= proxy.getcustdetails(cid);
	

	return c;
		
}
	@GetMapping("/findallCustInfo")
	public List<Customer>AllCustomersInformation(){
		return proxy.findall();
		
	}
	@GetMapping("/amountdeposit/accountnumber/{accountnumber}/depositAmount/{depositAmount}")
	public CustomerAccounts DepositBYAccountnumber(@PathVariable Integer accountnumber,@PathVariable Integer depositAmount) {
		
		CustomerAccounts c=new CustomerAccounts();
	     double f=	c.getBalance();
		
		return impl.DepositBYAccountnumber(accountnumber, depositAmount, f);
	   
		
	
	}
    @GetMapping("getbal/accountnumber/{accountnumber}")
	public CustomerAccounts checkbalanceBycid(Integer accountnumber) {
	return impl.checkbalanceByid(accountnumber);
	
    }
}
	

