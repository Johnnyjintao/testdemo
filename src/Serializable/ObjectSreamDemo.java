package Serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectSreamDemo{

	/**
	 * @param ��������л�, ��һ������д�뵽�ļ��У��ж�д����
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
//		writeObj();
		readObj();
	}
	
	public static void readObj() throws Exception{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("F:\\obj.txt"));
		
		Person p  = (Person) ois.readObject();
		System.out.println(p);
		ois.close();
	}

	public static void writeObj() throws Exception{
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F:\\obj.txt"));
		
		oos.writeObject(new Person("zhangsan",16));
		
		oos.close();
	}
}
