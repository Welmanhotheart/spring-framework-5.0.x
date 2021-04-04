package com.wei.spring.factory.test;

import com.wei.spring.beans.User;

public abstract class GetBeanTest {
	public void showMe() {
		getBean().showMe();
	}
	public abstract User getBean();
}
