/* 
program : For unmderstanding;
@author : Debjit Talukder
@ date : 6th sep, 2022
*/
//declaring class
class AverageDemo
{
	// calling the main method
public static void main (String[] args)
	{
		float marks1= Float.parseFloat(args[0]);
		float marks2= Float.parseFloat(args[1]);
		float marks3= Float.parseFloat(args[2]);
		float averageMarks= (marks1 + marks2 + marks3)/3; 
		System.out.println("The Average Marks Are:" +averageMarks);
	}
	//end of main 
}
//end of class firstdemo.