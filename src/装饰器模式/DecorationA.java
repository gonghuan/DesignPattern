package װ����ģʽ;

public class DecorationA extends Decoration {
	public DecorationA(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void learnSkills(){
		System.out.println("---------------------------");
		super.learnSkills();
		System.out.println("��·");
	}
}
