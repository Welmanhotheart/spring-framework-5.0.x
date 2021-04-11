package com.wei.spring.factory.test;

import com.wei.spring.beans.Customer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext bf = new ClassPathXmlApplicationContext("customer.xml");
		Customer testBean = (Customer) bf.getBean("testBean");
		System.out.println(testBean.getUserName() + testBean.getEmail());
	}
}
