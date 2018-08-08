package ге╫сдёй╫;

public class HPComputer extends Computer {
	public HPComputer(CPU cpu) {
		// TODO Auto-generated constructor stub
		super(cpu);
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("hp computer use " + cpu.display());
	}

}
