package week12;


import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {
	private static final String FilePath = "src/week11";
	
	public static void main(String[] args) throws IOException {
		File file = new File(FilePath);//��ǰ���̸�Ŀ¼
		
		System.out.println(file.exists());//�ж��ļ��Ƿ����
		System.out.println(file.isFile());//�ж�Ŀ���ǲ���һ���ļ�
		System.out.println(file.isDirectory());//�ж�Ŀ���ǲ���һ���ļ���
		
		System.out.println(file.getAbsolutePath());//��ȡ����·��
		System.out.println(file.getName());//��ȡ�ļ���
		System.out.println(file.getPath());//��ȡ���·��
		
		System.out.println(file.lastModified());
		System.out.println(new Date(file.lastModified()).toLocaleString());//��ȡ�ļ������޸�ʱ��
		
		System.out.println(file.isHidden());//�ж�һ���ļ��Ƿ�����
		System.out.println(file.canRead());//�ж�һ���ļ��Ƿ�ɶ�
		System.out.println(file.canWrite());//�ж�һ���ļ��Ƿ��д
		
		//�ļ����������ļ������ڵ�ʱ��ʹ���һ�����ļ�
//		if (!file.exists()) {
//			if(file.isFile()) {
//				file.createNewFile();
//				System.out.println("�ļ������ɹ�");
//			}else {
//				file.mkdir();
//				System.out.println("�ļ��д����ɹ�");
//			}
//			
//		}
		//����ļ���������һ���ļ��У������ɾ��
//		if(file.exists()&&file.isDirectory()) {
//			file.delete();
//			System.out.println("�ļ���ɾ���ɹ�");
//		}
		
		String [] filename = file.list();
		for (int i = 0; i < file.length(); i++) {
			System.out.println(filename[i]);
		}
		

	}

}
