package com.xiejun.Interceptor;

import com.xiejun.dynamicProxy.HelloImpl;
import com.xiejun.dynamicProxy.HelloWorld;

public class TestInterceptor {
	public static void main(String[] args) {
		testInterceptor();
		testChain();
	}
	
	
	public static void testInterceptor() {
		HelloWorld proxy = (HelloWorld) InterceptorJdkProxy.bind(new HelloImpl(), 
				"com.xiejun.Interceptor.MyInterceptor");
		proxy.sayHelloWorld();
	}
	
	public static void testChain() {
		HelloWorld proxy1 = (HelloWorld) InterceptorJdkProxy.bind(
                new HelloImpl(), "com.xiejun.Interceptor.Interceptor1");
        HelloWorld proxy2 = (HelloWorld) InterceptorJdkProxy.bind(
                proxy1, "com.xiejun.Interceptor.Interceptor2");
        HelloWorld proxy3 = (HelloWorld) InterceptorJdkProxy.bind(
                proxy2, "com.xiejun.Interceptor.Interceptor3");
        proxy3.sayHelloWorld();
	}
}
