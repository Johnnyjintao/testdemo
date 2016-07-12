package IOzifu;

import java.io.*;

public class FileReaderDemo {


	/**
	 *  读取文件内容
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("F:\\text.txt");
		
		char[] a = new char[1024];
		
		int num = 0;
		//read()方法可传数组参数，默认返回int类型，打印结果转成 char类型即可
		while ((num = fr.read(a))!= -1) {
//			System.out.print((char)num);
			
			//a表示一次读取1024个字符，从0开始，一直到num=-1结束
			String s = new String(a,0,num);
			
			System.out.println(s);
		}
		
		fr.close();
	}

}
