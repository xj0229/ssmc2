package com.xiejun.Interceptor;

import java.lang.reflect.Method;

public class Interceptor1 implements Interceptor{

	@Override
	public boolean before(Object proxy, Object target, Method method, Object[] args) {
		System.out.println("Interceptor1 Before");
		return false;
	}

	@Override
	public void around(Object proxy, Object target, Method method, Object[] args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void after(Object proxy, Object target, Method method, Object[] args) {
		System.out.println("Interceptor1 after");
	}

}