package com.xiejun.dynamicProxy;

import com.xiejun.cglibProxy.CglibProxyExample;

public class TestMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JdkProxyExample jdk = new JdkProxyExample();
		HelloWorld h = (HelloWorld) jdk.bind(new HelloImpl());
		h.sayHelloWorld();
		
		CglibProxyExample cpe = new CglibProxyExample();
		HelloImpl obj = (HelloImpl)cpe.getProxy(HelloImpl.class);
		obj.sayHelloWorld();

	}
}
