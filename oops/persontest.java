
/*
Progaram : Static variable VS Instance variable
@author: DEBJIT TALUKDER
@Date :22sep,2022.
*/

class PersonTest
{
   
   public static void main(String ...args)
   {
	   Person p1= new Person("Ankit",20,"male");
	    System.out.println("Person count :"+p1.counter);
	   Person p2= new Person("Deep",19,"male");
	    System.out.println("Person count :"+p2.counter);
	   Person p3= new Person("pramit",22,"Male");
	  System.out.println("Person count :"+p3.counter);
	   // Person.colonyChange("Mathura");
	   
	   System.out.println("--------------------------------------------------------");
	   
	   p1.display();
	   
	   System.out.println("--------------------------------------------------------");
	  
	   p2.display();
	   System.out.println("--------------------------------------------------------");
	   
	   p3.display();
	   
	   
	   
   }
	
	
	
}