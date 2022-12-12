/*
Crud : create update and delete
Program :Deleting element an array
@author: DEBJIT TALUKDER
@Date: 15sep,2022.
*/
import java.util.Scanner;

// declaring a class
class InsertionArray
{
    
   //method to update an element
   static void insert(int ar[], int num, int pos)
   {	  
         int size= ar.length;
		 int i;
	     int myArray[] = new int[size+1];
		 
		 for(i=0;i<pos-1;i++)
		 {
			 myArray[i]= ar[i];
		 }
		 
		 myArray[pos-1]=num;
		 
		 for(i=pos;i<size+1;i++)
		 {
			 myArray[i]= ar[i-1];
		 }
	   
	    System.out.print("Array after insertion:" );
		displayArray(myArray);
	   
	   
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
	 
	 System.out.println("----Elements before inserting value --------");
	 displayArray(arr);
     
	 System.out.println();
	 System.out.println("----Elements the value to be inserted :");
	 int value= sc.nextInt();
	 
	 System.out.println("----Elements the position at which it has to be inserted :");
	 int position= sc.nextInt();
	 
	  
    insert(arr,value,position);
	 
	 
    
  }
  
}