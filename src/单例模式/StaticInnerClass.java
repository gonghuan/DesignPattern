package ����ģʽ;

public class StaticInnerClass {
	private StaticInnerClass(){
		System.out.println("��̬�ڲ������ɵ���ģʽ");
	}
	
	private static class InnerClass{
		private static StaticInnerClass instance = new StaticInnerClass();
	}
	
	public static StaticInnerClass getInstance(){
		return InnerClass.instance;
	}
}
