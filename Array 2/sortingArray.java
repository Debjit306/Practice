/*
Program :Sorting an array
@author: DEBJIT TALUKDER
@Date: 15sep,2022.
*/
import java.util.Scanner;
import java.util.Arrays;

// declaring a class
class SortingArray
{
    //method to input elements in an array
   static void inputArray()
   {
    Scanner sc= new Scanner(System.in); // Scanner object for input of elements
	System.out.println("Enter the size of the array");
	int size= sc.nextInt();
	
	
	int arr[]= new int[size];// creating an array
	
	// loop to enter 10 elements
	 System.out.println("Enter "+ size +" elements");
	for(int i=0;i<size;i++)
	{
	  arr[i]= sc.nextInt();// taking integer input
	}
    // end of for
	 System.out.println("-------Array before Sorting are :----------");
   displayEnhancedFor(arr); // calling display method
   
  // sortArray(arr);
   
   Arrays.sort(arr); // sorting using java.util.Arrays
    
   System.out.println("-------Array after Sorting are :----------");
   displayEnhancedFor(arr); // calling display method
    
   }
   // end of inputArray method
   static void sortArray(int myar[])
   {
	   int temp;
	   for(int i=0;i<myar.length-1;i++)
	   {
		   for(int j=i+1;j<myar.length;j++)
		   {
			   if(myar[i]>myar[j])
			   {
				   temp = myar[i];
				   myar[i]=myar[j];
				   myar[j]=temp;
			   }
		   }
	   }
	    System.out.println();
	    System.out.println("-------Array after Sorting are :----------");
        displayEnhancedFor(myar); // calling display method
	   
   }
  
   static void displayEnhancedFor(int ar[])
   {
	  for(int i:ar)  // int : data type of array 
	  {
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