package ģ��ģʽ;

public abstract class AbstractTemplate {
	//���巽��������һ�������ִ���߼�
	public void templateMethod(){
		System.out.println("before");
		abstractMethod();
		System.out.println("after");
	}
	
	//���󷽷����ȵ�����ʵ�ֵ�ʱ����ʵ��
	public abstract void abstractMethod();
}
