package com.wei.spring.factory.test;

import com.wei.spring.beans.HelloBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorArgTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext bf = new ClassPathXmlApplicationContext("constructorArgTest.xml");
		HelloBean helloBean = bf.getBean("helloBean", HelloBean.class);
		System.out.println(helloBean.getName());
	}
}
