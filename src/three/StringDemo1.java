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
	
	//ȥ���ַ������˵Ŀո�
	public static String myTrim(String str){
		int start = 0,end = str.length()-1;
		while(start<end && str.charAt(start) == ' ')
			start++;
		while(start<end && str.charAt(end) == ' ')
			end--;
		return str.substring(start, end+1);
		
	}
	//���ַ�����ת
	public static String reverseString(String s){
		//�ַ���������
		char[] chs = s.toCharArray();
		
		//��ת����
		reverse(chs);
		//���������ַ���
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
