package week12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderTest {
	private static final String FilePath1 = "src/week12/FileTest.java";
	private static final String FilePath2 = "src/week12/writertest.java";
	
	public static void main(String[] args) throws FileNotFoundException {
		BufferedReader breader = new BufferedReader(new FileReader(FilePath1));
		String line =null;
		
		//�ж��Ƿ����
		try {
			while((line = breader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String content = "����ֱ����ǧ��\n"; //����д�������
		content += "�������������";
		
		BufferedWriter bwriter = null;//��������Writer�Ķ���
		try {
			bwriter = new BufferedWriter(new FileWriter(FilePath2));
			bwriter.write(content);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				bwriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
