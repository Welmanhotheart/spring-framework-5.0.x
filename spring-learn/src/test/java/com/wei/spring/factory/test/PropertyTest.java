package com.wei.spring.factory.test;

import com.wei.spring.beans.PropertyBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertyTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext bf = new ClassPathXmlApplicationContext("propertyTest.xml");
		PropertyBean test = bf.getBean("test", PropertyBean.class);
		System.out.println(test.getTestStr());
	}
}
