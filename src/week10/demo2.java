package week10;

import java.util.ArrayList;

public class demo2 {
   
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(11);
		a1.add(12);
		a1.add(33);
		a1.add(199);
		a1.add(987);
		
		//对所有元素求和
		int sum = 0;
//		for(int i =0;i <a1.size();i++) {
//			sum +=(int)a1.get(i);
		Object[] oj = a1.toArray();
		for (int i = 0;i < oj.length; i++) {
			sum +=(int) oj[i];	
					
		}
		System.out.print(sum);

		
	}
}
