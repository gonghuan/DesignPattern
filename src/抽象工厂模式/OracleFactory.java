package 抽象工厂模式;

public class OracleFactory implements IFactory {

	@Override
	public IUser createUser() {
		// TODO Auto-generated method stub
		return new OracleUser();
	}

	@Override
	public ILogin createLogin() {
		// TODO Auto-generated method stub
		return new OracleLogin();
	}

}
