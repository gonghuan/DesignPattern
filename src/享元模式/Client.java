package ÏíÔªÄ£Ê½;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight aFlyweight = flyweightFactory.factory("a");
        Flyweight bFlyweight = flyweightFactory.factory("b");
        Flyweight cFlyweight = flyweightFactory.factory("a");
        aFlyweight.operation("c");
        bFlyweight.operation("d");
        cFlyweight.operation("e");
        System.out.println(aFlyweight == cFlyweight);
	}

}
