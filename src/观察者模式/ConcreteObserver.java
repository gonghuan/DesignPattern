package �۲���ģʽ;

public class ConcreteObserver implements Observer {

	@Override
	public void update(Subject subject) {
		// TODO Auto-generated method stub
		if(subject instanceof ConcreteSubject){
			ConcreteSubject sub = (ConcreteSubject)subject;
			System.out.println("����״̬Ϊ��" + sub.getState());
		}
	}

}
