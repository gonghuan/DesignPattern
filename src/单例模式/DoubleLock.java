package 单例模式;

public class DoubleLock {
	private DoubleLock(){
		System.out.println("双重校验锁实现单例模式");
	}
	
	private static volatile DoubleLock instance = null;
	
	public static DoubleLock getInstance(){
		if(instance == null){
			synchronized (DoubleLock.class) {
				if(instance == null){
					instance = new DoubleLock();
				}
			}
		}
		return instance;
	}
}
