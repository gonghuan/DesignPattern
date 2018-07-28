package 工厂模式;

public class NormalOperationFactory implements IFactory{
	private Operation operation = null;
	
	@Override
	public double getResult(double num1, double num2, String operate){
		if(operate.equals("+")){
			operation = new AddOperation();
		}else if(operate.equals("-")){
			operation = new MinusOperation();
		}else if(operate.equals("*")){
			operation = new MultiOperation();
		}else{
			operation = new DivOperation();
		}
		return operation.getResult(num1, num2);
	}
}
