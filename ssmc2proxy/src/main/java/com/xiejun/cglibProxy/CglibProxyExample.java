package com.xiejun.cglibProxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxyExample implements MethodInterceptor{
	
	public Object getProxy(Class cls) {
		Enhancer e = new Enhancer();
		e.setSuperclass(cls);
		e.setCallback(this);
		return e.create();
	}

	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		System.out.println("Before");
		Object o = arg3.invokeSuper(arg0, arg2);
		System.out.println("After");
		return o;
	}

}
