package oopsExamples;

public class Student {
	
	int student_id;
	String student_name;
	
	protected void display() {
		System.out.println("Student ID   --> " + student_id);
		System.out.println("Student Name --> " + student_name);
	}
	

	public static void main(String[] args) {
		
		Student s1 = new Student();
		
	    s1.student_id = 1001;
	    s1.student_name = "Krishna";
	    s1.display();
		
	}

}
