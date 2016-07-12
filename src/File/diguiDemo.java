package File;

import java.io.File;

public class diguiDemo {

	/**
	 * @param javaµÝ¹é
	 */
	public static void main(String[] args) {
//		File f = new File("F:\\mobilesafe\\MoblieSafe");
//		showDir(f);
	
//		toBin(6);
		
		System.out.println(getsum(10));
	}
	
	public static void showDir(File f){
		System.out.println(f);
		
		File[] files = f.listFiles();
	
		for (int i = 0; i < files.length; i++) {
			if (files[i].isDirectory()) {
				showDir(files[i]);
			}
			else {
				System.out.println(files[i]);
			}
		}
	}
	
	
	public static void toBin(int num){
		if (num>0) {
			toBin(num/2);
			System.out.println(num%2);
		}
	}
	
	public static int getsum(int num){
		if (num==1) {
			return 1;
		}
		return num+getsum(num-1);
	}

}
