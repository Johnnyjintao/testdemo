package Serializable;

import java.io.Serializable;

public class Person implements Serializable{

	String name;
	int age;
	
	//指定类的UID
	public static final long serialVersionUID = 42L;

	 Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	

}
