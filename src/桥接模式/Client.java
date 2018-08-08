package ге╫сдёй╫;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 CPU intelCpu = new IntelCPU();
        CPU amdCpu = new AmdCPU();
        Computer dellComputer = new DellComputer(intelCpu);
        Computer dellComputer2 = new DellComputer(amdCpu);
        Computer hpComputer = new HPComputer(intelCpu);
        Computer hpComputer2 = new HPComputer(amdCpu);
        dellComputer.show();
        dellComputer2.show();
        hpComputer.show();
        hpComputer2.show();
	}

}
