package IOzifu;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileReaderDemo2 {

	private static FileWriter fw;
	private static FileReader fr;

	/**
	 * @param 复制文件
	 */
	public static void main(String[] args) {

		try {
			fw = new FileWriter("F:\\write.txt");
			fr = new FileReader("F:\\text.txt");
			
			int len = 0;
			
			char[] a = new char[1024];
			
			while ((len= fr.read(a))!=-1) {//不等于-1表示读完文件
				fw.write(a,0,len); //第一个参数，读取数组，第二个表示从0开始，第三个表示读到第几个字符
			}
			
			fw.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
