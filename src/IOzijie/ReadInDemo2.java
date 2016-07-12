package IOzijie;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

import IOzifu.FileReaderDemo;

public class ReadInDemo2 {

	/**
	 * @param ��һ���ı����ݴ�ӡ�ڿ���̨��
	 * 
	 * ������ȷ
	 * 1.Դ����ȡ��Ŀ��: ��ӡ
	 * 2.�ַ��������ı�
	 * 3.�ڿ���̨��
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		FileReader fis = new FileReader("F:\\text.txt");
		BufferedReader br = new BufferedReader(fis);
		
		String len = null;
		while ((len = br.readLine())!=null) {
		   System.out.println(len);
		}
		
		br.close();
	}

}
