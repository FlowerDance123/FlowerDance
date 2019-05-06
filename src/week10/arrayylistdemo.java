package week10;

import java.util.ArrayList;

public class arrayylistdemo {
       
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(123);
		a1.add(456);
		a1.add(789);
		a1.add(456);
		a1.add("tom");
		
		Object[] oj = a1.toArray();
		for (int i = 0;i < oj.length; i++) {
			System.out.println(oj[i]);
			
		}
		
		System.out.println(a1.isEmpty());
//		System.out.println(a1.contains(789));
		for (int i = 0;i < a1.size(); i++) {
			System.out.print(a1.get(i) + "  ");
		}
//	int[] array = {11,22,5,56,7};
//	for (int i = 0;i < array.length; i++) {
//		System.out.print(array[i]+" ");
//	}
	
	
	
	
	
	}
}
