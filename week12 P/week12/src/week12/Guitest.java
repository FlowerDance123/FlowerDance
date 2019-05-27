package week12;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Guitest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("my frame");
		f.setSize(500, 400);
		f.setLocation(300, 200);
		
		Button b =new Button("这是我的按钮");
		f.add(b);
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.out.println("关闭窗口");
				System.exit(0);
			}
			
			public void windowActivated(WindowEvent e) {
				System.out.println("我被激活了");
			}
		});
	}

}

//class Mywin extends WindowAdapter{
//	public void windowClosing(WindowEvent e) {
//		System.out.println("关闭窗口");
//		System.exit(0);
//	}
	

