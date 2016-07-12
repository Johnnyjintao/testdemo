package three;

public class StringDemo1 {

	public static void main(String[] args) {
		String a = "    abcde    ";
	
//		a = myTrim(a);
//		sop(a);
		
		a = reverseString(a);
		sop(a);
	}
	
	public static void sop(String str){
		System.out.println(str);
	}
	
	//去除字符串两端的空格
	public static String myTrim(String str){
		int start = 0,end = str.length()-1;
		while(start<end && str.charAt(start) == ' ')
			start++;
		while(start<end && str.charAt(end) == ' ')
			end--;
		return str.substring(start, end+1);
		
	}
	//将字符串反转
	public static String reverseString(String s){
		//字符串变数组
		char[] chs = s.toCharArray();
		
		//反转数组
		reverse(chs);
		//将数组变成字符串
		return new String(chs);
		
	}

	private static void reverse(char[] arr) {
		for (int start = 0,end = arr.length-1; start<end; start++,end--) {
			swap(arr,start,end);
		}
	}

	private static void swap(char[] arr, int x, int y) {
		char temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

}
