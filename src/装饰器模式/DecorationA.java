package 装饰器模式;

public class DecorationA extends Decoration {
	public DecorationA(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void learnSkills(){
		System.out.println("---------------------------");
		super.learnSkills();
		System.out.println("走路");
	}
}
