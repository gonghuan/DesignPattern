package ����ģʽ;

public class HungerVar {
	private HungerVar(){
		System.out.println("����ʽ�ı���");
	}
	
	private static HungerVar instance = null;
	
	static{
		instance = new HungerVar();
	}
	
	public static HungerVar getInstance(){
		return instance;
	}
}
