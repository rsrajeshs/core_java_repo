package demo;

import java.util.Scanner;

public class HonoursStudent extends StudentsMain
{
	//	SubClass extends SuperClass		// ref. to StudentsMain
	
	//	Variables
	int scholarship;
	String core_subject;
	String programme;
	
	
	//	Creating object for HonoursStudent class...
	//HonoursStudent hon_student_1 = new HonoursStudent();
	
	
	//	Functions
	
	public int get_student_gpa()
	{
		//		Telling the Scanner class to wait for the input from user...
		Scanner sc1 = new Scanner(System.in); 
		System.out.println("Enter Student GPA: ");
		int gpa_input = sc1.nextInt();
		
		return gpa_input;
	}
	
	public void check_scholarship_eligibility()
	{
		System.out.println("Checking the eligibility...");
		if(this.get_student_gpa() > 4)
		{
			System.out.println("Student is Eligible...");
		}
		else
		{
			System.out.println("Student GPA is low... ");
		}
		
	}
	
	public void check_programme_eligibility(boolean status)
	{
		System.out.println("Checking the programme eligibility...");
		if(status == true)
		{
			System.out.println("Student passed. Therefore, eligible for Ivy league programme...");
			
		}
		else
		{
			System.out.println("Student not eligible...");
		}
	}
	
	
	
}
