package IOzifu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Iterator;

public class BufferReaderDemo {

	/**
	 * @param BufferWriter 字符流读取缓冲区
	 * 
	 * 缓冲区的出现时为了提高流的操作效率尔出现的
	 * 所以在创建缓冲区之前，必须先有流对象
	 */
	public static void main(String[] args) {
		try {
			//创建一个字符读取流对象
			FileReader fr = new FileReader("F:\\Buffer.txt");
			
			//为了提高字符写入流的效率，加入了缓冲技术
			BufferedReader br = new BufferedReader(fr);
			
			String line = null;
			
			while ((line = br.readLine())!=null) {
				System.out.println(line);
			}
			br.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
