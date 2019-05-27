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
		
		//判断是否读完
		try {
			while((line = breader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String content = "飞流直下三千尺\n"; //定义写入的内容
		content += "疑是银河落九天";
		
		BufferedWriter bwriter = null;//创建缓存Writer的对象
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
