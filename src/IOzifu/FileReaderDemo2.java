package IOzifu;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileReaderDemo2 {

	private static FileWriter fw;
	private static FileReader fr;

	/**
	 * @param �����ļ�
	 */
	public static void main(String[] args) {

		try {
			fw = new FileWriter("F:\\write.txt");
			fr = new FileReader("F:\\text.txt");
			
			int len = 0;
			
			char[] a = new char[1024];
			
			while ((len= fr.read(a))!=-1) {//������-1��ʾ�����ļ�
				fw.write(a,0,len); //��һ����������ȡ���飬�ڶ�����ʾ��0��ʼ����������ʾ�����ڼ����ַ�
			}
			
			fw.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
