package 抽象工厂模式;

public class MysqlUser implements IUser {

	@Override
	public void initUser() {
		// TODO Auto-generated method stub
		System.out.println("init user from mysql");
	}

	@Override
	public int getUser() {
		// TODO Auto-generated method stub
		return 2;
	}

}
