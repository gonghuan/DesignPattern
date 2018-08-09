package 组合模式;

public class Leaf extends Component {
	
	private String name;
	
	public Leaf(String name){
		this.name = name;
	}
	
	@Override
	public void operator() {
		// TODO Auto-generated method stub
		System.out.println("叶子节点，name为：" + name);
	}

}
