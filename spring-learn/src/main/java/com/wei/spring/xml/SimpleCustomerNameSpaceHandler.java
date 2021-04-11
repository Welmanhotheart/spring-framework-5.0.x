package com.wei.spring.xml;

import com.wei.spring.parser.CustomerBeanDefinitionParser;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class SimpleCustomerNameSpaceHandler extends NamespaceHandlerSupport {

	@Override
	public void init() {
		registerBeanDefinitionParser("customer", new CustomerBeanDefinitionParser());
	}
}
