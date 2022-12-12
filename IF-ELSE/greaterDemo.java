/*
Program:Greater of 3 numbers
@author: DEBJIT TALUKDER
@Date: 9 sep 2022
*/

//declaring a class
class GreaterDemo
{
	//calling main
	
	
  public static void main(String[] args)
  {
	 int number1= Integer.parseInt(args[0]);
	  int number2= Integer.parseInt(args[1]);
	  int number3= Integer.parseInt(args[2]);
	 
	 if((number1==number2)&&(number1==number3))
	 {
		System.out.println("All numbers are equal"); 
	 }
	 //comparing the 2 numbers
	 else if((number1>number2)&&(number1>number3))
	      {
		     System.out.println("Number "+ number1 +" is greatest ");
	      }
	      else if(number2>number3)
	          {
		        System.out.println("Number "+ number2 +"  is greatest ");
		      }
	      
		      else // dangling else 
	         {
		        System.out.println("Number "+ number3 +"  is greatest");
			  }
		 
  }
 // end of main

}