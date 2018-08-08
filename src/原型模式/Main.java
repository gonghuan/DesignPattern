package 原型模式;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeepConcretePrototype prototype = new DeepConcretePrototype();
		prototype.setName("zhangsan");
		prototype.addPhone("1234567890");
		
		DeepConcretePrototype concretePrototype = (DeepConcretePrototype) prototype.clone();
		concretePrototype.setName("lisi");
		concretePrototype.addPhone("7498324973298");
		System.out.println(prototype.toString());
		System.out.println(concretePrototype.toString());
	}

}
