package 单例模式;

public class HungerVar {
	private HungerVar(){
		System.out.println("饿汉式的变种");
	}
	
	private static HungerVar instance = null;
	
	static{
		instance = new HungerVar();
	}
	
	public static HungerVar getInstance(){
		return instance;
	}
}
