/*
Program: Traversing a 2D array
@author: DEBJIT TALUKDER
@Date :16sep,2022.
*/

import java.util.Scanner;
class Traversing2DArray
{
	static void inputArray()
	{
		Scanner sc= new Scanner(System.in);
		int rows=0,cols=0;
		System.out.println("Enter the number of rows:");
		rows= sc.nextInt();
		System.out.println("Enter the number of cols:");
		cols= sc.nextInt();
		
		int arr[][]= new int[rows][cols];
		
		System.out.println("Enter the elements:");
		
		//outer loop for rows
		for(int i=0;i<rows;i++)
		{
			//inner loop for single row
			for(int j=0;j<cols;j++)
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