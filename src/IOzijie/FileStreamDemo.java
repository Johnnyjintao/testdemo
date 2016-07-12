package IOzijie;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Serializable;

public class FileStreamDemo{

	/**
	 * @param 字节流读取操作
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
	
	
	//通过循环一次读取一个字节
	public static void readFile() throws Exception{
		FileInputStream fi = new FileInputStream("F:StreamDemo.txt");
		
		int len = 0;
		while ((len = fi.read())!=-1) {
			System.out.println((char)len);
		}
		fi.close();
	}
	
	//通过循环一次读取1024个字节 ，read()返回作为整数读取的字符，read(char[] b)返回读取的字符数
	public static void readFile2() throws Exception{
		FileInputStream fi = new FileInputStream("F:StreamDemo.txt");
		
		int len = 0;
		byte[] b = new byte[1024];
		
		while ((len = fi.read(b))!=-1) {
			System.out.println(new String(b,0,len));
		}
		fi.close();
	}
	
	//一次计算好所有的字符长度，然后不用通过循环读取
	public static void readFile3() throws Exception{
		FileInputStream fi = new FileInputStream("F:StreamDemo.txt");
		
		byte[] b = new byte[fi.available()];
		
		fi.read(b); //将字符读入数组
		
		System.out.println(new String(b));
	}

}
