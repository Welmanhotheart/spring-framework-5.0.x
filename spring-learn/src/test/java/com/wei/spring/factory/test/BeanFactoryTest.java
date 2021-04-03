package com.wei.spring.factory.test;

import com.wei.spring.beans.MytestBean;
import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryTest {

	@Test
	public void testSimpleLoad() {
		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
		MytestBean myTestBean = (MytestBean) xmlBeanFactory.getBean("myTestBean");
		System.out.println(myTestBean.getTestStr());
	}
}
