package 组合模式;

public abstract class Component {
	public abstract void operator();
	
	public void addChild(Component child){
		throw new UnsupportedOperationException("对象不支持此功能");
	} 
	
	public void removeChild(Component child){
		throw new UnsupportedOperationException("对象不支持此功能");
	}
	
	public Component getChild(int index) {
        throw new UnsupportedOperationException("对象不支持此功能");
    }
}
