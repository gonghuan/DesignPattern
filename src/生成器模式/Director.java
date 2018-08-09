package 生成器模式;

public class Director {
	private IBuilder builder;
    public Director(IBuilder builder) {
        this.builder = builder;
    }
    public void construct() {
        builder.buildPart1();
        builder.buildPart2();
    }
}
