package 观察者模式;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteSubject subject = new ConcreteSubject("123");
		Observer observer = new ConcreteObserver();
		subject.attach(observer);
		subject.change("456");
	}

}
