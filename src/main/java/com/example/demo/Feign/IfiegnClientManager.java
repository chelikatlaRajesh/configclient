package com.example.demo.Feign;

import java.util.List;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entities.Customer;




//@FeignClient(name = "BankCustomer"),url = "http://localhost:9090") //=>without eureka
@FeignClient(name = "BankCustomer")

@LoadBalancerClient(name="BankCustomer")
public interface IfiegnClientManager {

	@GetMapping("Cust/delete/cid/{cid}")
	public void deletebyid(@PathVariable Integer cid);
	
	@GetMapping("Cust/getcust/{cid}")
	public Customer getcustdetails(@PathVariable Integer cid);
	
	@GetMapping("Cust/findall")
	public List<Customer>findall();
	
}
