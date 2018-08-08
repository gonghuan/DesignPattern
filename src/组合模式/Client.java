package 组合模式;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Component leaf = new Leaf("aLeaf");
        leaf.operator();
        Component composite = new Composite();
        Component composite2 = new Composite();
        composite2.addChild(leaf);
        composite.addChild(new Leaf("bLeaf"));
        composite.addChild(new Leaf("cLeaf"));
        composite.addChild(composite2);
        composite.operator();
	}

}
