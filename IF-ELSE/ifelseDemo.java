/*
Program:If Else Demo
@author: DEBJIT TALUKDER
@Date: 9 sep 2022
*/

//declaring a class
class IfElseDemo 
{
	//calling main
	
  public static void main(String[] args)
  {
	 int age= Integer.parseInt(args[0]); // taking input and parsing
	 
	 // checking the age 
	 if(age>=18)
	 {
		 System.out.println("You can vote");  // printing
	 }
	 //end if
	 else
	 {
		 System.out.println("Too young");// printing
	 }
	 //end else
		 
  }
 // end of main

}
