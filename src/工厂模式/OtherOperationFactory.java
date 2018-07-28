package 工厂模式;

public class OtherOperationFactory implements IFactory {

	@Override
	public double getResult(double num1, double num2, String operate) {
		// TODO Auto-generated method stub
		if(operate.equals("%")){
			return num1 % num2;
		}else{
			return 0.0d;
		}
	}

}
