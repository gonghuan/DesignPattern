package 单例模式;

public class Lazer {
	private Lazer(){
		System.out.println("懒汉式单例模式");
	}
	
	private static Lazer instance = null;
	
	public static synchronized Lazer getInstance() {
		if(instance == null){
			instance = new Lazer();
		}
		return instance;
	}
	
}
