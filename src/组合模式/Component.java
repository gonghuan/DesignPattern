package ���ģʽ;

public abstract class Component {
	public abstract void operator();
	
	public void addChild(Component child){
		throw new UnsupportedOperationException("����֧�ִ˹���");
	} 
	
	public void removeChild(Component child){
		throw new UnsupportedOperationException("����֧�ִ˹���");
	}
	
	public Component getChild(int index) {
        throw new UnsupportedOperationException("����֧�ִ˹���");
    }
}
