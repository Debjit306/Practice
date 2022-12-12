/*
Program:Greater of 2 numbers
@author: DEBJIT TALUKDER
@Date: 9 sep 2022
*/

//declaring a class
class IfElseDemo2 
{
	//calling main
	
  public static void main(String[] args)
  {
	 int number1= Integer.parseInt(args[0]);
	  int number2= Integer.parseInt(args[1]);
	 
	 //comparing the 2 numbers
	 if(number1 == number2)
	 {
		 System.out.println("Number "+ number1 +"  is equal to "+ number2);
	 }
	 else if(number1>number2)
	     {
		     System.out.println("Number "+ number1 +"  is greater than "+ number2);
	     }
	      else // dangling else 
	     {
		    System.out.println("Number "+ number2 +"  is greater than "+ number1);
	      }
		 
  }
 // end of main

}