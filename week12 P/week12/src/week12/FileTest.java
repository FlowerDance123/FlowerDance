package week12;


import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {
	private static final String FilePath = "src/week11";
	
	public static void main(String[] args) throws IOException {
		File file = new File(FilePath);//当前工程跟目录
		
		System.out.println(file.exists());//判断文件是否存在
		System.out.println(file.isFile());//判断目标是不是一个文件
		System.out.println(file.isDirectory());//判断目标是不是一个文件夹
		
		System.out.println(file.getAbsolutePath());//获取绝对路径
		System.out.println(file.getName());//获取文件名
		System.out.println(file.getPath());//获取相对路径
		
		System.out.println(file.lastModified());
		System.out.println(new Date(file.lastModified()).toLocaleString());//获取文件最后的修改时间
		
		System.out.println(file.isHidden());//判断一个文件是否隐藏
		System.out.println(file.canRead());//判断一个文件是否可读
		System.out.println(file.canWrite());//判断一个文件是否可写
		
		//文件创建，在文件不存在的时候就创建一个新文件
//		if (!file.exists()) {
//			if(file.isFile()) {
//				file.createNewFile();
//				System.out.println("文件创建成功");
//			}else {
//				file.mkdir();
//				System.out.println("文件夹创建成功");
//			}
//			
//		}
		//如果文件存在且是一个文件夹，则把它删除
//		if(file.exists()&&file.isDirectory()) {
//			file.delete();
//			System.out.println("文件夹删除成功");
//		}
		
		String [] filename = file.list();
		for (int i = 0; i < file.length(); i++) {
			System.out.println(filename[i]);
		}
		

	}

}
