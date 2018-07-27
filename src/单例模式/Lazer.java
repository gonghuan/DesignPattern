package ����ģʽ;

public class Lazer {
	private Lazer(){
		System.out.println("����ʽ����ģʽ");
	}
	
	private static Lazer instance = null;
	
	public static synchronized Lazer getInstance() {
		if(instance == null){
			instance = new Lazer();
		}
		return instance;
	}
	
}
