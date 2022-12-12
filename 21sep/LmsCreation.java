/*
@author: DEBJIT TALUKDER
@Date :21sep,2022.
*/
import java.util.*;

  class Student
  {
    private String name;
	private String password;
	private int id;
	
	 void createStudent()
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the name:");
		name=sc.next();
		
		System.out.println("Enter the ID:");
		id=sc.nextInt();
		
		password= name+"123";
		
		System.out.println("Student added successfully");
	}
	
	/*void displayStudent(int id)
	{
	  System.out.println("name:" + name);
	  System.out.println("ID :"+id);
	  System.out.println("Pass :"+password);
	}*/
	
	void displayStudent()
	{
	  System.out.println("name:" + name);
	  System.out.println("ID :"+id);
	  System.out.println("Pass :"+password);
	}
	
  }
  
  class LmsCreation
  {
   public static void main(String ...args)
    
	{
    Student stArray[]= new Student[10];// reference for creating an array of objects ()
	
	//Student st[]; // reference 
	//st= new Student[10];// memory allocation
	
	for(int i=0;i<5;i++)
	{
		System.out.println("Creating student :"+(i+1));
		stArray[i]= new Student();// allocation of memory to each student
		stArray[i].createStudent();
	}
	
	for(int i=0;i<5;i++)
	{
		System.out.println("Student Details :"+(i+1));
		stArray[i].displayStudent();
	}
	
    
	
	}
	
  }