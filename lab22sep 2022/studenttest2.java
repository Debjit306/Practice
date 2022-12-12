/*
Program: Java program to create a Student list which one get less than 90%.
@Author:- Debjit Talukder.
@Date:- 23Sep, 2022.
*/
import java.util.Scanner;
class StudentTest2
{
	public static void main(String ...args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of students:");
			
		int size = sc.nextInt();
		Student s[] = new Student[size];
		
		//loop to allocates memory
		
		//loop to input
		for(int i=0;i<size;i++)
		{
			s[i]= new Student();// allocating the memory
			System.out.println("Enter the Rollno:");
			s[i].setRollno(sc.nextInt());
			System.out.println("Enter the Name:");
			s[i].setName(sc.next());
			System.out.println("Enter the marks:");
			s[i].setMarks(sc.nextFloat());
			
						
		}
		System.out.println("----------Students with Marks more than 90---------");
		
		//loop for output
		for(int i=0;i<size;i++)
		{
			if((s[i].getMarks())>=90)
			{
				System.out.println("Name:  "+s[i].getName());
			}
			
		}
		
		
		
	}
	
	
}