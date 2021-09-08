package com.wei.spring.beans;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {
	private String userName;
	private String email;

	public Customer() {
		System.out.println("customer initialize");
	}
}
