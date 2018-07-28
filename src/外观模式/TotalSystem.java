package 外观模式;

public class TotalSystem {
	private MiniSystem1 miniSystem1;
	private MiniSystem2 miniSystem2;
	private MiniSystem3 miniSystem3;
	
	public void doSomething(){
		miniSystem1 = new MiniSystem1();
		miniSystem2 = new MiniSystem2();
		miniSystem3 = new MiniSystem3();
		miniSystem1.doSomething();
		miniSystem2.doSomething();
		miniSystem3.doSomething();
	}
}
