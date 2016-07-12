package four;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {

	/**
	 * Collection
	 *       List:元素是有序的，元素可以重复。因为该结合体系中有索引
	 *          ArrayList 底层使用的是数组数据结构，查询很快，增删稍慢（线程不同步）
	 *          LinkedList底层使用链表数据结构。特点：查询稍慢，增删很快
	 *          Vector 底层是数组数据结构。（线程同步）
	 *          
	 *       Set：元素是无序的，元素不可以重复。
	 *  List:
	 *  	List集合的特有方法。凡是可以操作角标的方法都是该体系特有的方法
	 *  增：
	 *  add(index,element);
	 *  addAll(index,Collection);
	 *  删:
	 *  remove(index);
	 *  改:
	 *  set(index,element);
	 *  查:
	 *  get(index);
	 *  subList(from,to);
	 *  listIterator();列表迭代器
	 *  
	 *  
	 *  List集合特有的迭代器。ListIterator是Iterator的子接口
	 *  
	 *  在迭代时，不可以通过集合对象的方法操作集合中的元素
	 *  因为会发生异常
	 *  
	 *  所以在
	 */
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		//添加元素
		al.add("java01");
		al.add("java02");
		al.add("java03");
		al.add("java04");
		
		al.add(1,"java09");
		al.remove(3);
		al.set(2, "java007");
		al.get(1);//获取
		
		//for循环遍历
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		//迭代
		Iterator it = al.iterator();
		while (it.hasNext()) {
			it.next();
		}
		
		sop(al);
	}

	public static void  sop(Object i) {
		System.out.println(i);
	}
}
