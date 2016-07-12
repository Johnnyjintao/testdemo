package IOzifu;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo {

	/**
	 * @param BufferWriter 字符流写入缓冲区
	 * 
	 * 缓冲区的出现时为了提高流的操作效率尔出现的
	 * 所以在创建缓冲区之前，必须先有流对象
	 */
	public static void main(String[] args) {
		try {
			//创建一个字符写入流对象
			FileWriter fw = new FileWriter("F:\\Buffer.txt");
			
			//为了提高字符写入流的效率，加入了缓冲技术
			BufferedWriter bfw = new BufferedWriter(fw);
			
			for (int i = 0; i < 5; i++) {
				bfw.write("啦啦啦德玛西亚"+i);
				bfw.newLine();
			}
			
			bfw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
