package ����ģʽ;

public class DoubleLock {
	private DoubleLock(){
		System.out.println("˫��У����ʵ�ֵ���ģʽ");
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
