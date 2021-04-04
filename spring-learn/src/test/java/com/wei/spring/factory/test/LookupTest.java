package com.wei.spring.factory.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LookupTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext bf = new ClassPathXmlApplicationContext("lookupTest.xml");
		GetBeanTest getBeanTest = (GetBeanTest) bf.getBean("getBeanTest");
		getBeanTest.showMe();

	}
}
