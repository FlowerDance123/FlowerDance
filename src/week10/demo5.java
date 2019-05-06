package week10;

import java.util.LinkedList;

public class demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   LinkedList ll =new  LinkedList();
   ll.add(22);
   ll.add(33);
   ll.add(44);
//   for(Object o:ll) {
//	   System.out.println(o);
//   }
   ll.addFirst(11);
   ll.addLast(11);
   for(Object o:ll) {
	   System.out.println(o);
   }
   

	}

}
