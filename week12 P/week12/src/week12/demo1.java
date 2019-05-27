package week12;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

public class demo1 {
	
	private Frame f;
	private Button bu;
	private TextField tf;
	private TextArea ta;
	
	demo1(){
		init();
	}
	
	public void init() {
		f = new Frame("my frame");
		f.setBounds(300, 100, 600, 500);
		f.setLayout(new FlowLayout());
		
		tf = new TextField(30);
		bu = new Button("×ªµ½");
		ta = new TextArea(15,40);
		
		f.add(tf);
		f.add(bu);
		f.add(ta);
		
		myEvent();
		
		f.setVisible(true);		
	}
	
	public void myEvent() {
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		bu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String dirPath = tf.getText();
				File dir = new File(dirPath);
				
				if (dir.exists() && dir.isDirectory()) {
					ta.setText("");
					 String[] names = dir.list();
					 for(String name:names) {
						 ta.append(name + "\r\n");
					 }
				}
			}
		});
	
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new demo1();
	}

}
