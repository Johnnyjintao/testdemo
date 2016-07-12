package IOzifu;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class MyLineNumberReader {

	/**
	 * @param MyLineNumberReader 自定义装饰类
	 */
	private Reader r;
	private int LineNumber;
	
	public MyLineNumberReader(Reader r) {
		this.r = r;
	}
	
	public int getLineNumber() {
		return LineNumber;
	}

	public void setLineNumber(int lineNumber) {
		LineNumber = lineNumber;
	}
	
	public String MyReadLine() throws IOException{
		StringBuilder sb = new StringBuilder();
		LineNumber++;
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



	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("F:\\text.txt");
		
		MyLineNumberReader mr = new MyLineNumberReader(fr);
		
		String len = null;
		
		while ((len = mr.MyReadLine())!=null) {
			System.out.println(mr.getLineNumber()+":"+len);
		}
	}

}
