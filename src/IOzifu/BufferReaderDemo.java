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
	 * @param BufferWriter �ַ�����ȡ������
	 * 
	 * �������ĳ���ʱΪ��������Ĳ���Ч�ʶ����ֵ�
	 * �����ڴ���������֮ǰ����������������
	 */
	public static void main(String[] args) {
		try {
			//����һ���ַ���ȡ������
			FileReader fr = new FileReader("F:\\Buffer.txt");
			
			//Ϊ������ַ�д������Ч�ʣ������˻��弼��
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
