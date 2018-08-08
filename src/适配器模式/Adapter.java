package ÊÊÅäÆ÷Ä£Ê½;

public class Adapter extends Adaptee implements Target {

	@Override
	public void someFunctions() {
		// TODO Auto-generated method stub
		System.out.println("functions do not be adapted");
	}

	@Override
	public void specialFunction() {
		// TODO Auto-generated method stub
		this.funtionToBeUsed();
	}

}
