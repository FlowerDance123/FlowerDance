package week10;

public class demo3 {
    public static void main(String[] args) {
	int sum=0;    
    int[] array = {22,33,44,55,66,77};
	for(Object o : array) {
		sum +=(int)o;
		System.out.println(o);	
	}
	System.out.println(sum);
}
}
