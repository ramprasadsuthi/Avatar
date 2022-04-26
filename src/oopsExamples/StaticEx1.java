package oopsExamples;

public class StaticEx1 {
	
	static int ccode = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticEx1 c1 = new StaticEx1();
		StaticEx1 c2 = new StaticEx1();
		
		System.out.println("C1-Code : " + c1.ccode);
		System.out.println("C2-Code : " + c2.ccode);
		
		c1.ccode = 30;
		
		System.out.println("C1-Code : " + c1.ccode);
		System.out.println("C2-Code : " + c2.ccode);
	}

}
