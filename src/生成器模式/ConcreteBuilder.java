package 生成器模式;

public class ConcreteBuilder implements IBuilder {
	private Product product;
	
	public ConcreteBuilder() {
		// TODO Auto-generated constructor stub
		product = new Product();
	}
	
	
	@Override
	public void buildPart1() {
		// TODO Auto-generated method stub
		product.setPart1("part1");
	}

	@Override
	public void buildPart2() {
		// TODO Auto-generated method stub
		product.setPart2("part2");
	}

	@Override
	public Product getResults() {
		// TODO Auto-generated method stub
		return product;
	}

}
