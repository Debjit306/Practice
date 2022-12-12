/*
program:- constractor
@author: DEBJIT TALUKDER
@Date :20sep,2022.
 */
class Student
{
	//instance variable
 private int id;
 private String name;
 private float marks;
 private String course;
 
 
 //Student(); -> default constructor which initialize all the variable int
 
 Student() // no argument constructor
 {
	 System.out.println("----  No arg constructor----");
    this.id= 00;
    this.name= "void";
    this.marks= 0.0f;	
	this.course="null";
 }
 // constructor overloading: Polymorphism
  Student(int id,String name,float marks,String course) // parameterized constructor
  {
	  System.out.println("----  Paramaterized  constructor1----");
	  this.id=id;
	  this.name=name;
	  this.marks=marks;
	  this.course= course;
  }
  
  Student(int id,String name,float marks) // parameterized constructor
  {
	  System.out.println("----  Paramaterized  constructor2----");
	  this.id=id;
	  this.name=name;
	  this.marks=marks;
	  this.course= "BCA";
  }
  
  //copy constructor
  Student(Student s)
  {
	  System.out.println("----  Copy constructor----");
	  this.id=s.id;
	  this.name=s.name;
	  this.marks=s.marks;
	  this.course=s.course;
  }
  // to change the value of course
   void setCourse(String course)
   {
	   this.course=course;
   }
 
 void display()
 {
   //String course; local variable is not initialized 
   System.out.println("--------------------");
  System.out.println("ID:"+id);
  System.out.println("Name:"+name);
    System.out.println("Marks:"+marks);
	 System.out.println("Course:"+course);
  }
 
 public static void main(String ...args)
 {
   Student s= new Student();
   s.display();
   Student s1= new Student(23,"Shuruti",90f,"MBA");
  s1.display();
  Student s2= new Student(24,"Mitul",85f);
  s2.display();
  
  /* // copying the values via constructor: deep copy : no changes are reflected
  Student copyst= new Student(s2);
  copyst.display();
    
	// changing the value of course for s2
	s2.setCourse("MBBS");
	 System.out.println("After changing s2 couse to MBBS");
	 s2.display();
	copyst.display(); */
	
	 Student s3= new Student();
	s3=s2; // copying the contents directly : Shallow copy : changes are reflected
	s3.display();
	
	//changing the value of course for s2
	s2.setCourse("MBBS");
	 System.out.println("After changing s2 couse to MBBS");
	 s2.display();
	s3.display();
	 
	
	
	
	
 }

   }