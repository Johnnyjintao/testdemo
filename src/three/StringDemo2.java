package three;

public class StringDemo2 {
	/**
	 * 找出字符串djaklsfjsdjxlkwsk中k出现的次数
	 * @param args
	 */

	public static void main(String[] args) {
		String a = "djaklsfjsdjxlkwsk";
		String b = "k";
		System.out.println(getSubCount(a, b));
	}
	
	public static void sop(String str){
		System.out.println(str);
	}
	
	public static int getSubCount(String str,String key)
	{
		int count = 0;
		int index = 0;
		
		while((index=str.indexOf(key))!=-1)
		{
			sop("str="+str);
			str = str.substring(index+key.length());
			count++;
		}
		return count;
	}
	
}
