package 观察者模式;

public class ConcreteSubject extends Subject{
	private String state;
	
	public ConcreteSubject(String state){
		this.state = state;
	}
	
	public void change(String state){
		this.state = state;
		notifyObservers();
	}
	
	public String getState(){
		return state;
	}
}
