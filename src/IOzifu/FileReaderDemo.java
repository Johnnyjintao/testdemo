package IOzifu;

import java.io.*;

public class FileReaderDemo {


	/**
	 *  ��ȡ�ļ�����
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("F:\\text.txt");
		
		char[] a = new char[1024];
		
		int num = 0;
		//read()�����ɴ����������Ĭ�Ϸ���int���ͣ���ӡ���ת�� char���ͼ���
		while ((num = fr.read(a))!= -1) {
//			System.out.print((char)num);
			
			//a��ʾһ�ζ�ȡ1024���ַ�����0��ʼ��һֱ��num=-1����
			String s = new String(a,0,num);
			
			System.out.println(s);
		}
		
		fr.close();
	}

}
