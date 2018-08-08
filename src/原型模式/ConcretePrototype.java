package 原型模式;

import java.util.ArrayList;
import java.util.List;

public class ConcretePrototype implements Prototype {
	private String name;
	private List<String> phones = new ArrayList<>();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhones(){
		return phones;
	}

	public void addPhone(String phone){
		this.phones.add(phone);
	}
	
	

	@Override
	public String toString() {
		return "ConcretePrototype [name=" + name + ", phones=" + phones + "]";
	}

	@Override
	public ConcretePrototype clone(){
		try {
			return (ConcretePrototype) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
