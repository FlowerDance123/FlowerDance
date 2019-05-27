package week12;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class frameTest {
	private Frame f;
	private Button bu;
	private TextField tf;
	
	
	frameTest(){
		init();
	}
	public void init() {
		f = new Frame("my frame");
		f.setBounds(300, 100, 600, 500);
		f.setLayout(new FlowLayout());
		
		tf = new TextField(10);
		bu = new Button("my button");
		
		f.add(bu);
		f.add(tf);
		myEvent();
		f.setVisible(true);		
	}
	
	public void myEvent() {
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.out.println("窗口关闭");
				System.exit(0);
			} 
		});
//		bu.addActionListener(new ActionListener() {
			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				System.out.println("按钮退出");
//				System.exit(0);
//			}
//		});
		
//		bu.addMouseListener(new MouseAdapter() {
//			public void mouseEntered(MouseEvent e) {
//				System.out.println("鼠标已进入");								
//			} 
//			public void mouseClicked(MouseEvent e) {
//				if (e.getClickCount()>=2) {
//					System.out.println("按钮被双击");
//				}
//				
//			}
//			
//			
//		});
		bu.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				//System.out.println(KeyEvent.getKeyText(e.getKeyCode())+ ".........." + e.getKeyCode());
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					System.out.println("这是由回车键关闭的");
					System.exit(0);
				}
			}
		});
		tf.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();
				if (!(code>KeyEvent.VK_0 && code <=KeyEvent.VK_9)) {
					System.out.println("你的输入为非法");
					e.consume();
				}
			}
		});
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new frameTest();
	}

}
