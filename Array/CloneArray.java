
/*
Program: Creating an anonymous array
@author: DEBJIT TALUKDER
@Date :16sep,2022.
*/
// declaring class
class CloneArray{
   
   // method to print an array
   static void copyArray(int originalArray[])
   {
	   //declaring an array to create a clone
	   
	   int clArray[] = originalArray.clone(); // deep copy : changes are not reflected
	   
	   //declaring an array to create copy
	   int copyarr[] =originalArray;   // shallow copy : changes are reflected
	   
	   System.out.println("Printing the values of original array" );
	   
           displayArray(originalArray);	   
		   
		   //changing the values of original array
		   for(int i=0;i<originalArray.length;i++)
		   {
			   originalArray[i]+=2;
		   }
		   
		   //after change 
		    System.out.println();
		  System.out.println("Printing the values of copied array" ); 
		   
		   displayArray(copyarr);
		   
		    System.out.println();
		    System.out.println("Printing the values of cloned array" ); 
		   
		   displayArray(clArray);
	  
   }
   // end of method
   
   // method to display an array
   static void displayArray(int myArray[])
   {
	   // loop to print array elements
      for(int i:myArray)
	  {
	   System.out.print(i+ "  ");// printing an array element
	  }
	  // end of for
   }
   
   // main method
   public static void main(String ...args)
   {
	   //declaring an array
	   int arr[]={4,2,7,3};
	   
	   // calling the method copyArray
       copyArray(arr);
   
   }

// end of main

} 

// end of class