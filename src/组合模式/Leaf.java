package ���ģʽ;

public class Leaf extends Component {
	
	private String name;
	
	public Leaf(String name){
		this.name = name;
	}
	
	@Override
	public void operator() {
		// TODO Auto-generated method stub
		System.out.println("Ҷ�ӽڵ㣬nameΪ��" + name);
	}

}
