package IOzifu;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	/**
	 *  字节流的抽象基类
		InputStream，OutputStream
		字符流的抽象基类
		Reader，Writer。
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		FileWriter fl = new FileWriter("F:\\text.txt");
		
		fl.write("哈哈哈");
		
		fl.close();
	}

}
