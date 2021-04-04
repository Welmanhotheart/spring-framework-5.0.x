package com.wei.spring.factory.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReplacerTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext bf = new ClassPathXmlApplicationContext("replacerTest.xml");
		TestChangeMethod test = bf.getBean("testChangeMethod", TestChangeMethod.class);
		test.changeMe();


	}
}
