/*
Program : Implement Scanner class
@author: DEBJIT TALUKDER
@Date: 14sep,2022.
*/
import java.util.Scanner;

class ScannerDemo
{
	static int rollNo;
	static String name;
	static float marks;
	static char gender;
	static void takeInput()
	{
		/* Scanner sc; // refernce for Scanner class. no memory
		sc= new Scanner(System.in); // memory */
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your roll number:");
		rollNo= sc.nextInt(); // integer input
		
		System.out.println("Enter your name:");
		name= sc.next(); // string input
		
		System.out.println("Enter your roll marks:");
		marks= sc.nextFloat(); // float input
		
		System.out.println("Enter your gender:");
		gender= sc.next().charAt(0);  // character input
		
			
	}
	
	static void display()
	{
		System.out.println();
		System.out.println();
		System.out.println("-----------Student Details-----------");
		System.out.println("Roll number:"+ rollNo);
		System.out.println("Name:"+ name);
        System.out.println("Gender:"+ gender);
        System.out.println("Marks:"+ marks);		
		
		
	}
	
  public static void main(String ...args)
  {
    takeInput();
    display();
  
  }

}