package com.example.demo.entities;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Customer {

	private Integer cid;
	private String cname;
	private String caddress;
	
	
}
