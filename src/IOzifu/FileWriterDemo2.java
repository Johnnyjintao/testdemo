package IOzifu;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo2 {

	/**
	 *  对已有文件的续写
	 */
	public static void main(String[] args) throws IOException {
		
		//传递一个true参数，代表不覆盖已有的文件，而是在文件的末尾处进行续写
		FileWriter fl = new FileWriter("F:\\text.txt",true);
		
		fl.write("嘻嘻嘻");
		
		fl.close();
	}

}
