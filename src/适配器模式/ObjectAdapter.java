package ÊÊÅäÆ÷Ä£Ê½;

public class ObjectAdapter extends AbstractTarget {
	private Adaptee adaptee;
	
	public ObjectAdapter(Adaptee adaptee) {
		// TODO Auto-generated constructor stub
		this.adaptee = adaptee;
	}
	
	@Override
	public void someFunctions() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void specialFunction() {
		// TODO Auto-generated method stub
		adaptee.funtionToBeUsed();
	}

}
