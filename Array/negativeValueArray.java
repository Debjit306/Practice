/*
Program :Traversing an array
@author: DEBJIT TALUKDER
@Date: 15sep,2022.
*/
import java.util.Scanner;

// declaring a class
class NegativeValuesArray
{
    //method to input elements in an array
   static void inputArray()
   {
    Scanner sc= new Scanner(System.in); // Scanner object for input of elements
	int arr[]= new int[5];// creating an array
	
	// loop to enter 10 elements
	 System.out.println("Enter 5 elements");
	for(int i=0;i<5;i++)
	{
	  arr[i]= sc.nextInt();// taking integer input
	}
    // end of for
	 System.out.println("-------Negative Values are :----------");
   displayEnhancedFor(arr); // calling display method
   }
   // end of inputArray method
   
  
   static void displayEnhancedFor(int ar[])
   {
	  for(int i:ar)  // int : data type of array 
	  {
		  if(i<0)
		  System.out.print(i+ "  ");
		  
	  }
    
	   
   }
   
 
   
     
   //main method
  public static void main(String ...args)
  {
	  // calling method inputArray
   inputArray();
   
    
  }
  
}