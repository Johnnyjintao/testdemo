package IOzijie;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Serializable;

public class FileStreamDemo{

	/**
	 * @param �ֽ�����ȡ����
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
//		writeFile();
		readFile2();
	}
	
	public static void writeFile() throws Exception{
		FileOutputStream fo = new FileOutputStream("F:StreamDemo.txt");
		
		fo.write("abcdefg".getBytes());
		
		fo.close();
	}
	
	
	//ͨ��ѭ��һ�ζ�ȡһ���ֽ�
	public static void readFile() throws Exception{
		FileInputStream fi = new FileInputStream("F:StreamDemo.txt");
		
		int len = 0;
		while ((len = fi.read())!=-1) {
			System.out.println((char)len);
		}
		fi.close();
	}
	
	//ͨ��ѭ��һ�ζ�ȡ1024���ֽ� ��read()������Ϊ������ȡ���ַ���read(char[] b)���ض�ȡ���ַ���
	public static void readFile2() throws Exception{
		FileInputStream fi = new FileInputStream("F:StreamDemo.txt");
		
		int len = 0;
		byte[] b = new byte[1024];
		
		while ((len = fi.read(b))!=-1) {
			System.out.println(new String(b,0,len));
		}
		fi.close();
	}
	
	//һ�μ�������е��ַ����ȣ�Ȼ����ͨ��ѭ����ȡ
	public static void readFile3() throws Exception{
		FileInputStream fi = new FileInputStream("F:StreamDemo.txt");
		
		byte[] b = new byte[fi.available()];
		
		fi.read(b); //���ַ���������
		
		System.out.println(new String(b));
	}

}
