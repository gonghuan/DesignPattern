package 模板模式;

public abstract class AbstractTemplate {
	//具体方法，定义一个大体的执行逻辑
	public void templateMethod(){
		System.out.println("before");
		abstractMethod();
		System.out.println("after");
	}
	
	//抽象方法，等到子类实现的时候再实现
	public abstract void abstractMethod();
}
