package four;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ArrayList
 * @author john
 *
 *1.add�����Ĳ���������Object.�Ա��ڽ����������͵Ķ���
 *
 *2.�����д洢�Ķ��Ƕ��������(�ڴ��ַ)
 *
 *3.�������Ǽ��ϵ�ȡ��Ԫ�صķ�ʽ
 */

public class CollectionDemo {

	
	public static void main(String[] args) {
		baseMethodGet();
	}
	
	
	public static void baseMethodGet(){
		//����һ������������ʹ��collection�ӿڵ�����
		ArrayList al = new ArrayList();
		
		//���Ԫ��
		al.add("java01");
		al.add("java02");
		al.add("java03");
		al.add("java04");
		
		//��ȡ������������ȡ�������е�Ԫ��
		Iterator it = al.iterator();
		while (it.hasNext()) {
			sop(it.next());
		}
		
	}
	
	public static void baseMethod(){
		//����һ������������ʹ��collection�ӿڵ�����
				ArrayList al = new ArrayList();
				
				//���Ԫ��
				al.add("java01");
				al.add("java02");
				al.add("java03");
				al.add("java04");
				
				//ɾ��Ԫ��
				//al.remove("java02");
				
				//�ж�Ԫ��
				sop("java03�Ƿ����:"+al.contains("java03"));
				
				sop(al);
				
				//al.retainAll(al2) ȡ������al��ֻ�ᱣ����al2����ͬ��Ԫ��
	}
	
	
	public static void  sop(Object i) {
		System.out.println(i);
		
		
	}
}
