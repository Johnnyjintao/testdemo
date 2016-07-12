package File;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class JavaFileList {

	/**
	 * @param ��һ��ָ��Ŀ¼�µ�java�ļ��ľ���·�����洢��һ���ı��ļ���
	 */
	public static void main(String[] args) {
		
		File f= new File("E:\\ѧϰ��Ƶ\\java\\��ѧ�ÿƼ�_��ʿ��_J2SE_5.0_��05��_����");
		
		List<File> list = new ArrayList<File>();

		FiletoList(f, list);
		
		File ff = new File(f,"javalist.txt");
		WriteToFile(list, ff.toString());
		System.out.println(list.size());
	}
	
	
	public static void FiletoList(File dir ,List<File> list){
		File[] files = dir.listFiles();
		
		for (int i = 0; i < files.length; i++) {
			if (files[i].isDirectory()) {
				FiletoList(files[i], list);
			}
			else {
				if (files[i].getName().endsWith(".avi")) {
					list.add(files[i]);
				}
			}
		}
	}
	
	public static void WriteToFile(List<File> list,String javaListFile){
		
		try {
			BufferedWriter bfw = new BufferedWriter(new FileWriter(javaListFile));

			for (File file : list) {
				String path = file.getAbsoluteFile().toString();
				
				bfw.write(path);
				bfw.newLine();
				bfw.flush();
				
			}
			
			bfw.close();
		} catch (Exception e) {

		}
		
		
	}

}
