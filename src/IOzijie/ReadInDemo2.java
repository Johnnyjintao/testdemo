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
	 * @param 将一个文本数据打印在控制台上
	 * 
	 * 三个明确
	 * 1.源：读取。目的: 打印
	 * 2.字符流，纯文本
	 * 3.在控制台上
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
