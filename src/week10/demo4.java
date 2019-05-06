package week10;

import java.util.Vector;

public class demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		v.add("kiki");
		v.add("coco");
		v.add("jiejie");
		for(Object o:v) {
			System.out.println(o);
		}
		System.out.println(v.isEmpty());
		v.remove(0);
		for(Object o:v) {
			System.out.println(o);
		}
	}

}
