package ге╫сдёй╫;

public class DellComputer extends Computer {
	
	public DellComputer(CPU cpu) {
		// TODO Auto-generated constructor stub
		super(cpu);
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("dell computer use " + cpu.display());
	}

}
