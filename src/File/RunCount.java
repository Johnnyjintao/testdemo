package File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class RunCount {

	/**
	 * @param ģ��һ�������ļ�
	 */
	public static void main(String[] args) throws Exception{
		//����һ�����϶���
		Properties pro = new Properties();
		//����һ���ļ�����
		File file = new File("F:\\count.txt");
		if (!file.exists()) {
			file.createNewFile();
		}else {
			//����һ������������ȡ�ļ�
			FileInputStream fi = new FileInputStream(file);
			//�����������load��������
			pro.load(fi);
			
			int count = 0;
			
			//ͨ�����õ�ֵ
			String value = pro.getProperty("time");
			
			if (value!=null) {
				count = Integer.parseInt(value);
				if (count>=5) {
					System.out.println("��������");
				}
			}
				count++;
				
				pro.setProperty("time", count+"");
				
				FileOutputStream fos = new FileOutputStream(file);
				
				pro.store(fos, "");
			
		}
		
	}

}
