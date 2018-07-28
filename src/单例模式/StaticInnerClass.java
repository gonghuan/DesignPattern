package ����ģʽ;

public class StaticInnerClass {
	private StaticInnerClass(){
		System.out.println("��̬�ڲ������ɵ���ģʽ");
	}
	
	private static class InnerClass{
		private static final StaticInnerClass instance = new StaticInnerClass();
	}
	
	public static final StaticInnerClass getInstance(){
		return InnerClass.instance;
	}
}
