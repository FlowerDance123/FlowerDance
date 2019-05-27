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
				System.out.println("���ڹر�");
				System.exit(0);
			} 
		});
//		bu.addActionListener(new ActionListener() {
			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				System.out.println("��ť�˳�");
//				System.exit(0);
//			}
//		});
		
//		bu.addMouseListener(new MouseAdapter() {
//			public void mouseEntered(MouseEvent e) {
//				System.out.println("����ѽ���");								
//			} 
//			public void mouseClicked(MouseEvent e) {
//				if (e.getClickCount()>=2) {
//					System.out.println("��ť��˫��");
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
					System.out.println("�����ɻس����رյ�");
					System.exit(0);
				}
			}
		});
		tf.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();
				if (!(code>KeyEvent.VK_0 && code <=KeyEvent.VK_9)) {
					System.out.println("�������Ϊ�Ƿ�");
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
