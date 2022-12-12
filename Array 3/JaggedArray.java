
//Jagged array: when we dont have equal columns in every row

/*
Program: Jagged array.
@author: DEBJIT TALUKDER
@Date :16sep,2022.

*/

import java.util.Scanner;
class JaggedArray
{
	static void inputArray()
	{
		Scanner sc= new Scanner(System.in);
		
		
		int arr[][]= new int[3][];
		arr[0]= new int[3];
		arr[1]= new int[2];
		arr[2]= new int[4];
		
		
		System.out.println("Enter the elements:");
		
		//outer loop for rows
		for(int i=0;i<arr.length;i++)
		{
			//inner loop for single row
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]= sc.nextInt();
			}
			// end of innerloop
		}
		// end of outer loop
		
		System.out.println();
		
		System.out.println("Array elements are:");
         displayArray(arr);
		
	}
	
	static void displayArray(int myArray[][])
	{
		for(int[] arrayRow:myArray)
		{
			for(int myrow:arrayRow)
			{
				System.out.print(myrow+ "  ");
			}
			
			System.out.println();
				
		}
		
	}

   public static void main(String ...args)
  {

     inputArray();

  }


}   


   
