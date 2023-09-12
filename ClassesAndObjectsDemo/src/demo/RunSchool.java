package demo;

public class RunSchool
{

	public static void main(String[] args)
	{
		// Classname objectname = new Classname();
		// Syntax for creating an object...
		StudentsMain Student_1 = new StudentsMain();
		StudentsMain Student_2 = new StudentsMain();
		
		TeachersMain Teacher_1 = new TeachersMain();
		
		AdminMain Admin_1 = new AdminMain();
		
		//	Assigning values to the variables of an object...
		Student_1.name = "John";
		Student_1.studentId = 101;
		
		Student_2.name = "Dave";
	
		// Calling the functions of an object...
		// Syntax: objectname.functionname();
		Student_1.marking_attendance();
		Student_1.printing_student_name();
	}

}
