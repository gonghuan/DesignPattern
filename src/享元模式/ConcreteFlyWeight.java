package ÏíÔªÄ£Ê½;

public class ConcreteFlyWeight implements Flyweight {
	private String instrinsicState;
	
	public ConcreteFlyWeight(String instrinsicState) {
        this.instrinsicState = instrinsicState;
    }
	
	@Override
	public void operation(String state) {
		// TODO Auto-generated method stub
		System.out.println("instrinsicState : " + instrinsicState);
        System.out.println("state : " + state);
	}

}
