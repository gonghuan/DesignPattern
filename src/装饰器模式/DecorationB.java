package 装饰器模式;

public class DecorationB extends Decoration {
	public DecorationB(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void learnSkills(){
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		super.learnSkills();
		System.out.println("拿筷子");
	}
}
