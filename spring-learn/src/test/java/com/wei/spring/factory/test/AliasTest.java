package com.wei.spring.factory.test;

import com.wei.spring.beans.AliasBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AliasTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext bf = new ClassPathXmlApplicationContext("aliasTest.xml");
		AliasBean bean = bf.getBean("aliasBean", AliasBean.class);
		System.out.println(bean);
	}
}
