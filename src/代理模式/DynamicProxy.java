package 代理模式;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {
	
	private Subject subject;
	
	public DynamicProxy(Subject subject) {
		// TODO Auto-generated constructor stub
		this.subject = subject;
	}
	
	@Override
	public Object invoke(Object object, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("before rent house");
		System.out.println("Method " + method);
		method.invoke(subject, args);
		System.out.println("after rent house");
		return null;
	}

}
