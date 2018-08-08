package ×°ÊÎÆ÷Ä£Ê½;

public class Decoration implements Component {
	private Component component;
	
	public Decoration(Component component) {
		// TODO Auto-generated constructor stub
		this.component = component;
	}
	
	@Override
	public void learnSkills() {
		// TODO Auto-generated method stub
		component.learnSkills();
	}

}
