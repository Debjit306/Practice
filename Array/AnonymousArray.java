//Anonymous array: Array without a name
/*
Program: Creating an anonymous array
@author: DEBJIT TALUKDER
@Date :16sep,2022.
*/
// declaring class
class AnonymousArray{
   
   // method to print an array
   static void printArray(int arr[])
   {
	   // loop to print array elements
      for(int i:arr)
	  {
	   System.out.println(i);// printing an array element
	  }
	  // end of for
   }
   // end of method
   
   // main method
   public static void main(String ...args)
   {
	   // calling the method printArray
    printArray(new int[]{6,7,9,1,2});
   
   }

// end of main

} 

// end of class