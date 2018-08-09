package 生成器模式;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IBuilder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct();
        Product product = builder.getResults();
        System.out.println(product);
	}

}
