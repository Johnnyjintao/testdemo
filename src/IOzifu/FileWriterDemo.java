package IOzifu;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	/**
	 *  �ֽ����ĳ������
		InputStream��OutputStream
		�ַ����ĳ������
		Reader��Writer��
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		FileWriter fl = new FileWriter("F:\\text.txt");
		
		fl.write("������");
		
		fl.close();
	}

}
