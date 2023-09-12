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

}
