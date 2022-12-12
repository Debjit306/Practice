/*
Crud : create update and delete
Program :Deleting element an array
@author: DEBJIT TALUKDER
@Date: 15sep,2022.
*/
import java.util.Scanner;

// declaring a class
class DeletingArray
{
    
   //method to delete an element
   static void delete(int ar[], int num)
   {
	   boolean found=false;
	   int pos=-1;
	   
	   // searching the value in the loop
	   for(int i=0; i<ar.length;i++)
	   {
		   if(ar[i]==num)
		   {
			   found=true;
			   pos=i;
			   break;
		   }
	   }
	   
	   //deleting value
	   
	   if(found)
	   {
		   for(int i=pos+1;i<ar.length;i++)
		   {
			   ar[i-1]=ar[i];
		   }
		   
		   System.out.println("----Elements after deleting the value "+ num + " are :");
	        
			for(int i=0; i<ar.length-1;i++)
			{
				System.out.print(ar[i]+" ");
			}
	   }
	   
	   else
		   System.out.println("----Element not found------");
	   
   }
  
   static void displayArray(int ar[])
   {
	  for(int i:ar)  // int : data type of array 
	  {
		  System.out.print(i+ "  ");
		  
	  }
    
	   
   }
   
 
   
     
   //main method
  public static void main(String ...args)
  {
	Scanner sc= new Scanner(System.in); // Scanner object for input of elements
	System.out.println("Enter the size of the array");
	int size= sc.nextInt();
	
	
	int arr[]= new int[size];// creating an array
	
	// loop to enter the elements
	 System.out.println("Enter "+ size +" elements");
	for(int i=0;i<size;i++)
	{
	  arr[i]= sc.nextInt();// taking integer input
	}
     // end of for
	 
	 System.out.println("----Elements before deleting the value --------");
	 displayArray(arr);
     
	 System.out.println();
	 System.out.println("----Elements the element to be deleted :");
	 int value= sc.nextInt();
	 
	 delete(arr,value);// calling delete method
	 
	  
	 
    
  }
  
}