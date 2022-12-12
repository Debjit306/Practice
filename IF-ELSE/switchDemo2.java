/*
Program:Printing the day on the basis of values
@author: DEBJIT TALUKDER
@Date: 9 sep 2022
*/

//declaring a class
class SwitchDemo2 
{
	//calling main
	
  public static void main(String[] args)
  {
	
	//char grade = Character.parseCharacter
		
      char grade= args[0].toUpperCase().charAt(0);
	
	
	switch(grade)
	{
		case 'A': System.out.println("Pass:Excellent");
		        break;
	 	case 'B':	System.out.println("Pass:Very Good");
		        break;	
		case 'C': System.out.println("Pass:Good");
		        break;
		case 'D': System.out.println("Pass:Can Do Better");
		        break;
		case 'F': System.out.println("Fail");
		        break;
		
		default:System.out.println("Wrong input ");
		        		
		
	}
	// end of switch
		 
  }
 // end of main

}