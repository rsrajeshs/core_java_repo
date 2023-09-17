package demo;

public class StudentsMain
{
	// variables or data or attributes
	int studentId;
	String name;
	boolean passed;
	float gpa;
	
	//functions or methods 
	void marking_attendance()
	{
		System.out.println("Student attendance marked...");
	
	}
	
	void printing_student_name()
	{
		//	"this" keyword refers to the current object of the class.
		System.out.println("Student name: " + this.name);
		System.out.println("Student ID: " + this.studentId);

	}
	
	void printing_results(boolean pass)
	{
		System.out.println("Student result: " + pass);
	}

	//	1. Assigning values during declaration...
	//	2. Passing values in the calling statement...
	//	3. Passing values for the current/this object...
}
