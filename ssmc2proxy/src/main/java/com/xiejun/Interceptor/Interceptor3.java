package com.xiejun.Interceptor;

import java.lang.reflect.Method;

public class Interceptor3 implements Interceptor{

	@Override
	public boolean before(Object proxy, Object target, Method method, Object[] args) {
		System.out.println("Interceptor3 Before");
		return false;
	}

	@Override
	public void around(Object proxy, Object target, Method method, Object[] args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void after(Object proxy, Object target, Method method, Object[] args) {
		System.out.println("Interceptor3 after");
	}

}