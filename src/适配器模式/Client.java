package ÊÊÅäÆ÷Ä£Ê½;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Target concreteTarget = new ConcreteTarget();
		concreteTarget.specialFunction();
		Target adapter = new Adapter();
		adapter.specialFunction();*/
		
		AbstractTarget target = new ObjectAdapter(new Adaptee());
		target.specialFunction();
	}

}
