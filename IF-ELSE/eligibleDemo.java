/*
Program:Eigibilty for college
@author: DEBJIT TALUKDER
@Date: 9 sep 2022
*/

//declaring a class
class EligibleDemo
{
	//calling main
	
	
  public static void main(String[] args)
  {
	 float totalMarks= Float.parseFloat(args[0]);
	 float pcmMarks= Float.parseFloat(args[1]);
	 
	 // Nested if 
	 
	
		 
	 
	  if(totalMarks>60)
	  {
		  if((totalMarks>=80)||(pcmMarks>=85))
		  {
			  System.out.println("You are eligible to take admission in B.tech");
		  }
		  // end of inner if
		  else
		  {
			  System.out.println("You are eligible to take admission (EXCEPT B.TECH)");
		  }
		  // end of inner else
	  }
	  // end of outer if
	  else
	  {
		  System.out.println("You are not eligible for our college");
		  
	  }
	 
	 
		        
			 
  }
 // end of main

}
