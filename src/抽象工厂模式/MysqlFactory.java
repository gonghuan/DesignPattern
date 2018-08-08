package 抽象工厂模式;

public class MysqlFactory implements IFactory {

	@Override
	public IUser createUser() {
		// TODO Auto-generated method stub
		return new MysqlUser();
	}

	@Override
	public ILogin createLogin() {
		// TODO Auto-generated method stub
		return new MysqlLogin();
	}

	

}
