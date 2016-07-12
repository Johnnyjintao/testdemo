package IOzijie;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import IOzifu.BufferWriterDemo;

public class ReadIn {

	/**
	 * @param ��ȡת����
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		InputStream in = System.in;
		
		//���ֽ�������ת��Ϊ�ַ�������
		InputStreamReader isr = new InputStreamReader(in);
		
		OutputStreamWriter osr = new OutputStreamWriter(System.out);
		
		BufferedWriter bw = new BufferedWriter(osr); 
		
		//���建����
		BufferedReader br = new BufferedReader(isr);
		
		String len = null;
		
		while ((len = br.readLine())!=null) {
			if ("over".equals(len)) {
				break;
			}
			bw.write(len);
			bw.newLine();
			bw.flush();
		}
		
		br.close();
		
//		InputStream in = System.in;
//		
//		StringBuilder sb = new StringBuilder();
//		
//		while (true) {
//			int ch = in.read();
//			if (ch =='\r') {
//				continue;
//			}
//			if (ch == '\n') {
//				String s = sb.toString();
//				if ("over".equals(s)) {
//					break;
//				}
//				System.out.println(s.toUpperCase());
//				sb.delete(0, sb.length());
//			}
//			sb.append((char)ch);
//		}
		
	}

}
