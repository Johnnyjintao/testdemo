package IOzifu;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
/**
 * �Զ���MyBufferReader���е�MyReadLine()����
 * @author john
 *
 */
public class MyBufferReader {
	
	private FileReader r;
	public MyBufferReader(FileReader r) {
		this.r = r;
	}
	
	
	public String MyReadLine() throws IOException{
		StringBuilder sb = new StringBuilder();
		
		int num = 0;
		while ((num = r.read())!= -1) {
			if (num == '\r') 
				continue;
			if (num == '\n') 
				return sb.toString();
			else
				sb.append((char)num);
		}
		return null;
		
	}
	

	/**
	 * @param 
	 * @throws IOException 
	 */
	public static void main(String[] args){
		try {
			FileReader fr = new FileReader("F:\\text.txt");
			MyBufferReader mr = new MyBufferReader(fr);
			String len = null;
			
			while ((len = mr.MyReadLine())!= null) {
				System.out.println(len);
			}
			
			fr.close();
		} catch (Exception e) {
			
		}
			
		
	}
	


}
