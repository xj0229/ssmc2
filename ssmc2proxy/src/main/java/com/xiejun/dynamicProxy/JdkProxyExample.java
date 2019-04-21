package com.xiejun.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxyExample implements InvocationHandler{
	
	private Object target = null;
	
	public Object bind(Object o) {
		this.target=o;
		return Proxy.newProxyInstance(o.getClass().getClassLoader(), o.getClass().getInterfaces(), this);
		
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Before");
		System.out.println("hhhhhhhh");
		Object obj = method.invoke(this.target, args);
		System.out.println("After");
		return obj;
	}

}