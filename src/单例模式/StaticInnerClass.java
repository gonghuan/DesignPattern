package 单例模式;

public class StaticInnerClass {
	private StaticInnerClass(){
		System.out.println("静态内部类生成单例模式");
	}
	
	private static class InnerClass{
		private static StaticInnerClass instance = new StaticInnerClass();
	}
	
	public static StaticInnerClass getInstance(){
		return InnerClass.instance;
	}
}
