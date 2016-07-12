package File;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class JavaFileList {

	/**
	 * @param 将一个指定目录下的java文件的绝对路径，存储到一个文本文件中
	 */
	public static void main(String[] args) {
		
		File f= new File("E:\\学习视频\\java\\尚学堂科技_马士兵_J2SE_5.0_第05章_数组");
		
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
