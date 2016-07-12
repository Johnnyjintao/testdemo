package four;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {

	/**
	 * Collection
	 *       List:Ԫ��������ģ�Ԫ�ؿ����ظ�����Ϊ�ý����ϵ��������
	 *          ArrayList �ײ�ʹ�õ����������ݽṹ����ѯ�ܿ죬��ɾ�������̲߳�ͬ����
	 *          LinkedList�ײ�ʹ���������ݽṹ���ص㣺��ѯ��������ɾ�ܿ�
	 *          Vector �ײ����������ݽṹ�����߳�ͬ����
	 *          
	 *       Set��Ԫ��������ģ�Ԫ�ز������ظ���
	 *  List:
	 *  	List���ϵ����з��������ǿ��Բ����Ǳ�ķ������Ǹ���ϵ���еķ���
	 *  ����
	 *  add(index,element);
	 *  addAll(index,Collection);
	 *  ɾ:
	 *  remove(index);
	 *  ��:
	 *  set(index,element);
	 *  ��:
	 *  get(index);
	 *  subList(from,to);
	 *  listIterator();�б������
	 *  
	 *  
	 *  List�������еĵ�������ListIterator��Iterator���ӽӿ�
	 *  
	 *  �ڵ���ʱ��������ͨ�����϶���ķ������������е�Ԫ��
	 *  ��Ϊ�ᷢ���쳣
	 *  
	 *  ������
	 */
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		//���Ԫ��
		al.add("java01");
		al.add("java02");
		al.add("java03");
		al.add("java04");
		
		al.add(1,"java09");
		al.remove(3);
		al.set(2, "java007");
		al.get(1);//��ȡ
		
		//forѭ������
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		//����
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
