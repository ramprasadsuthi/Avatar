package basics;

public class LargestOfTwo {

	public static void main(String[] args) {
		// Largest of Two Numbers
		
		int a = 500; 
		int b = 200;
		
		if(a > b) {
			System.out.println("A is the largest : " + a);
		} else if(b > a) {
			System.out.println("B is the largest : " + b);
		} else {
			System.out.println("Both A & B are equal : " + a , " - " b);
		}
		
	}

}
