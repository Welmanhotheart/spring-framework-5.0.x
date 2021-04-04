package com.wei.spring.beans;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HelloBean {
	private String name;
	private String message;
	public HelloBean(String name, String message) {
		this.name = name;
		this.message = message;
	}
}
