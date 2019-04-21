package com.xiejun.Interceptor;

import java.lang.reflect.Method;

public class MyInterceptor implements Interceptor{

	@Override
	public boolean before(Object proxy, Object target, Method method, Object[] args) {
		System.out.println("Before");
		return false;
	}

	@Override
	public void around(Object proxy, Object target, Method method, Object[] args) {
		System.out.println("around");
		
	}

	@Override
	public void after(Object proxy, Object target, Method method, Object[] args) {
		System.out.println("after");
		
	}

}