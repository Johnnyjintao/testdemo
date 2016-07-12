package IOzifu;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo {

	/**
	 * @param BufferWriter �ַ���д�뻺����
	 * 
	 * �������ĳ���ʱΪ��������Ĳ���Ч�ʶ����ֵ�
	 * �����ڴ���������֮ǰ����������������
	 */
	public static void main(String[] args) {
		try {
			//����һ���ַ�д��������
			FileWriter fw = new FileWriter("F:\\Buffer.txt");
			
			//Ϊ������ַ�д������Ч�ʣ������˻��弼��
			BufferedWriter bfw = new BufferedWriter(fw);
			
			for (int i = 0; i < 5; i++) {
				bfw.write("��������������"+i);
				bfw.newLine();
			}
			
			bfw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
