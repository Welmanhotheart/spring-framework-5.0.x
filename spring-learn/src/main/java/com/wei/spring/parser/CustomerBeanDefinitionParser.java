package com.wei.spring.parser;

import com.wei.spring.beans.Customer;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.beans.factory.xml.AbstractBeanDefinitionParser;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

public class CustomerBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

//	@Override
//	protected AbstractBeanDefinition parseInternal(Element element, ParserContext parserContext) {
//		String userName = element.getAttribute("userName");
//		String email = element.getAttribute("email");
//		GenericBeanDefinition bean = new GenericBeanDefinition();
//		if (StringUtils.hasText(userName)) {
//			bean.getPropertyValues().add("userName", userName);
//			bean.getPropertyValues().add("email", email);
//		}
//		String id = element.getAttribute("id");
//		if (StringUtils.hasText(id)) {
//			parserContext.getReaderContext().getRegistry().registerBeanDefinition(id, bean);
//		}
//		return bean;
//	}


	@Override
	protected Class<?> getBeanClass(Element element) {
		return Customer.class;
	}

	protected void doParse(Element element, BeanDefinitionBuilder builder) {
		String userName = element.getAttribute("userName");
		String email = element.getAttribute("email");
		GenericBeanDefinition bean = new GenericBeanDefinition();
		if (StringUtils.hasText(userName)) {
			builder.addPropertyValue("userName", userName);
		}
		if(StringUtils.hasText(email)){
			builder.addPropertyValue("email", email);
		}

	}

}
