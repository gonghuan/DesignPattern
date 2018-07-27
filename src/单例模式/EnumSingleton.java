package 单例模式;

public enum EnumSingleton {
	instance;
	
	public void sameFunction(){
		System.out.println("枚举类型实现的单例模式");
	}
}
