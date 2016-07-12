package File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class RunCount {

	/**
	 * @param 模拟一个配置文件
	 */
	public static void main(String[] args) throws Exception{
		//创建一个集合对象
		Properties pro = new Properties();
		//创建一个文件对象
		File file = new File("F:\\count.txt");
		if (!file.exists()) {
			file.createNewFile();
		}else {
			//创建一个输入流，读取文件
			FileInputStream fi = new FileInputStream(file);
			//将流里的数据load到集合中
			pro.load(fi);
			
			int count = 0;
			
			//通过键拿到值
			String value = pro.getProperty("time");
			
			if (value!=null) {
				count = Integer.parseInt(value);
				if (count>=5) {
					System.out.println("超过次数");
				}
			}
				count++;
				
				pro.setProperty("time", count+"");
				
				FileOutputStream fos = new FileOutputStream(file);
				
				pro.store(fos, "");
			
		}
		
	}

}
