package IOzifu;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo2 {

	/**
	 *  �������ļ�����д
	 */
	public static void main(String[] args) throws IOException {
		
		//����һ��true�����������������е��ļ����������ļ���ĩβ��������д
		FileWriter fl = new FileWriter("F:\\text.txt",true);
		
		fl.write("������");
		
		fl.close();
	}

}
