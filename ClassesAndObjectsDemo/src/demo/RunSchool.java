package demo;

import java.util.Scanner;

public class RunSchool
{

	public static void main(String[] args)
	{
		// Classname objectname = new Classname();
		// Syntax for creating an object...
		StudentsMain Student_1 = new StudentsMain();
		StudentsMain Student_2 = new StudentsMain();
		StudentsMain Student_50 = new StudentsMain();
		
		TeachersMain Teacher_1 = new TeachersMain();
		
		AdminMain Admin_1 = new AdminMain();
		
		//	Assigning values to the variables of an object...
		Student_1.name = "John";
		Student_1.studentId = 101;
		
		Student_2.name = "Dave";
		Student_2.studentId = 102;
	
		// Calling the functions of an object...
		// Syntax: objectname.functionname();
		Student_1.marking_attendance();
		Student_1.printing_student_name();
		Student_1.printing_results(true);
		
		//Scanner class will get input
		Scanner scanner_object = new Scanner(System.in);
		Scanner sc_2 = new Scanner(System.in);

		
		System.out.println("Enter Student ID: ");
		//	"nextInt() function will wait till the user types in an input...
		Student_50.studentId = scanner_object.nextInt();
		
		System.out.println("Enter Student Name: ");
		Student_50.name = sc_2.nextLine();
		
		System.out.println("You entered Student ID: " + Student_50.studentId);
		System.out.println("You entered Student name: " + Student_50.name);
	}

}
