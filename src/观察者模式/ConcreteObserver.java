package 观察者模式;

public class ConcreteObserver implements Observer {

	@Override
	public void update(Subject subject) {
		// TODO Auto-generated method stub
		if(subject instanceof ConcreteSubject){
			ConcreteSubject sub = (ConcreteSubject)subject;
			System.out.println("主题状态为：" + sub.getState());
		}
	}

}
