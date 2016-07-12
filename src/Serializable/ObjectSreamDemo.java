package Serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectSreamDemo{

	/**
	 * @param 对象的序列化, 把一个对象写入到文件中，有读写操作
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
