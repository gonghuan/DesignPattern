package ×°ÊÎÆ÷Ä£Ê½;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Component componentA = new ComponentA();
		Component componentB = new ComponentB();
		Decoration decorationAA = new DecorationA(componentA);
		Decoration decorationBA = new DecorationB(decorationAA);
		Decoration decorationCA = new DecorationC(decorationBA);
		Decoration decorationAB = new DecorationA(componentB);
		Decoration decorationBB = new DecorationB(decorationAB);
		Decoration decorationCB = new DecorationC(decorationBB);
		decorationCA.learnSkills();
		decorationCB.learnSkills();
	}

}
