package four;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ArrayList
 * @author john
 *
 *1.add方法的参数类型是Object.以便于接受任意类型的对象
 *
 *2.集合中存储的都是对象的引用(内存地址)
 *
 *3.迭代器是集合的取出元素的方式
 */

public class CollectionDemo {

	
	public static void main(String[] args) {
		baseMethodGet();
	}
	
	
	public static void baseMethodGet(){
		//创建一个集合容器，使用collection接口的子类
		ArrayList al = new ArrayList();
		
		//添加元素
		al.add("java01");
		al.add("java02");
		al.add("java03");
		al.add("java04");
		
		//获取迭代器，用于取出集合中的元素
		Iterator it = al.iterator();
		while (it.hasNext()) {
			sop(it.next());
		}
		
	}
	
	public static void baseMethod(){
		//创建一个集合容器，使用collection接口的子类
				ArrayList al = new ArrayList();
				
				//添加元素
				al.add("java01");
				al.add("java02");
				al.add("java03");
				al.add("java04");
				
				//删除元素
				//al.remove("java02");
				
				//判断元素
				sop("java03是否存在:"+al.contains("java03"));
				
				sop(al);
				
				//al.retainAll(al2) 取交集，al中只会保留和al2中相同的元素
	}
	
	
	public static void  sop(Object i) {
		System.out.println(i);
		
		
	}
}
