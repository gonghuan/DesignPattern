package 单例模式;

public class Hunger {
	private Hunger(){
		System.out.println("饿汉式单例模式");
	}
	
	private static Hunger instance = new Hunger();
	
	public static Hunger getInstance(){
		return instance;
	}
}
