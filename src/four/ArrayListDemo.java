package four;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 把对象封装到集合中并将其去除重复
 * @author john
 *
 */

class Person{
	private String name;
	private int age;
	
	Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public boolean equals(Object obj){
		if (!(obj instanceof Person)) 
		{
			return false;
		}
		else {
			Person p = (Person) obj;
			return this.name.equals(p.getName()) && this.age == p.getAge();
		}
	}
	
}

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(new Person("zhangsan",18));
		list.add(new Person("lisi",18));
		list.add(new Person("zhangsan",18));
		list.add(new Person("wangwu",18));
		list.add(new Person("zhaoliu",18));
		
		list = singleElement(list);
		
		
		Iterator it = list.iterator();
		
		while (it.hasNext()) {
			Person p = (Person) it.next();
			System.out.println(p.getName()+"...."+p.getAge());
		}
		
	}
	
	public static ArrayList singleElement(ArrayList al){
		ArrayList newal = new ArrayList();
		
		Iterator it = al.iterator();
		
		while (it.hasNext()) {
			Object obj = it.next();
			if (!newal.contains(obj)) {
				newal.add(obj);
			}
		}
		return newal;
	}
	
	

}
