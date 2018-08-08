package 代理模式;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject subject = new RealSubject();
		
		InvocationHandler handler = new DynamicProxy(subject);
		
		Subject subject2 = (Subject)Proxy.newProxyInstance(handler.getClass().getClassLoader(), subject.getClass().getInterfaces(), handler);
		
		System.out.println(subject2.getClass().getName());
		
		subject2.rent();
		
		subject2.hello("world");
	}

}
