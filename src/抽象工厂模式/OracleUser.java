package 抽象工厂模式;

public class OracleUser implements IUser {

	@Override
	public void initUser() {
		// TODO Auto-generated method stub
		System.out.println("init table user from oracle");
	}

	@Override
	public int getUser() {
		// TODO Auto-generated method stub
		return 1;
	}

}
