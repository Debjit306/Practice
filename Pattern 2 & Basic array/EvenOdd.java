/*
Program : Entering elements in array and computing even and odd sums
@author: DEBJIT TALUKDER
@Date: 14sep,2022.
*/

import java.util.Scanner;

class EvenOddSumArray
{ 
	static void evenOdd()
	{
		Scanner sc= new Scanner(System.in);
	 System.out.println("Enter the size of the array:");
	 int size= sc.nextInt();
	 
	 int evenSum=0,oddSum=0;
	 
	 //declaring the array
	int arr[]= new int[size];
	 System.out.println("Enter the elements:");
	 
	 //entering the elements in an array
	for(int i=0;i<size;i++)
	{
		arr[i]=sc.nextInt();
	}
	
	// traversing an array and checking the number is even or odd
	for(int i=0;i<size;i++)
	{
		if(arr[i]%2==0)// check if the number is even
		{
			evenSum+=arr[i]; // evenSum= evenSum+arr[i]
		}
		else
			oddSum+=arr[i];
	}
  	
	 System.out.println("Sum of even elements:"+evenSum);
      System.out.println("Sum of odd elements:"+oddSum);
 }
	
		
 public static void main(String ... args)
 {
   	 
   evenOdd();

}
}