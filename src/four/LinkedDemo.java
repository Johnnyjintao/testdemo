package four;

import java.util.ArrayList;
import java.util.Iterator;

public class LinkedDemo{

	/**
	 * 去除ArrayList中的重复元素
	 */
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("java01");
		al.add("java02");
		al.add("java01");
		al.add("java02");
		al.add("java03");
		al.add("java01");
		
		System.out.println(singleElement(al));
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
