package 原型模式;

import java.util.ArrayList;
import java.util.List;

public class DeepConcretePrototype implements Prototype{
	private String name;
	private ArrayList<String> phones = new ArrayList<>();
	
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
	
	public void setPhones(ArrayList<String> phones) {
		this.phones = phones;
	}
	

	@Override
	public String toString() {
		return "DeepConcretePrototype [name=" + name + ", phones=" + phones + "]";
	}

	@Override
	public DeepConcretePrototype clone(){
		try {
			DeepConcretePrototype concretePrototype = (DeepConcretePrototype)super.clone();
			concretePrototype.phones = (ArrayList<String>)this.phones.clone();
			return concretePrototype;
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
