package ����ģʽ;

public class Hunger {
	private Hunger(){
		System.out.println("����ʽ����ģʽ");
	}
	
	private static Hunger instance = new Hunger();
	
	public static Hunger getInstance(){
		return instance;
	}
}
