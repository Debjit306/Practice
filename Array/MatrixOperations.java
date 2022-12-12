/*
Program: Marix Operation
@author: DEBJIT TALUKDER
@Date :16sep,2022.
*/

import java.util.Scanner;
class MatrixOperations
{
	static void displayArray(int resMatrix[][])
	{
		for(int[] arrayRow:resMatrix)
		{
			for(int myrow:arrayRow)
			{
				System.out.print(myrow+ "  ");
			}
			
			System.out.println();
				
		}
		
	}
	
	static void additionMatrix(int ar1[][], int ar2[][])
	{
		int rarr[][] = new int[3][3];
		//outer loop for rows
		for(int i=0;i<3;i++)
		{
			//inner loop for single row
			for(int j=0;j<3;j++)
			{
				rarr[i][j]= ar1[i][j]+ar2[i][j];
			}
			// end of innerloop
		}
		// end of outer loop
		System.out.println();
		System.out.println("The resultant matrix after addition is :");
		displayArray(rarr);
		
	}
	
	static void subtractionMatrix(int ar1[][], int ar2[][])
	{
		int rarr[][] = new int[3][3];
		//outer loop for rows
		for(int i=0;i<3;i++)
		{
			//inner loop for single row
			for(int j=0;j<3;j++)
			{
				rarr[i][j]= ar1[i][j]-ar2[i][j];
			}
			// end of innerloop
		}
		// end of outer loop
		System.out.println();
		System.out.println("The resultant matrix after subtraction is :");
		displayArray(rarr);
		
	}
	
	static void multiplicationMatrix(int ar1[][], int ar2[][])
	{
		int rarr[][] = new int[3][3];
		//outer loop for rows
		for(int i=0;i<3;i++)
		{
			//inner loop for single row
			for(int j=0;j<3;j++)
			{
				rarr[i][j]=0;
				for(int k=0;k<3;k++)
				{
					rarr[i][j]= rarr[i][j]+(ar1[i][k]*ar2[k][j]);
				}
			}
			// end of innerloop
		}
		// end of outer loop
		System.out.println();
		System.out.println("The resultant matrix after subtraction is :");
		displayArray(rarr);
		
	}

   public static void main(String ...args)
  {
      Scanner sc= new Scanner(System.in);
	     String ch;
				
		int arr1[][]= new int[3][3];
		int arr2[][]= new int[3][3];
		
		System.out.println("Enter the elements for 1st array:");
		
		//outer loop for rows
		for(int i=0;i<3;i++)
		{
			//inner loop for single row
			for(int j=0;j<3;j++)
			{
				arr1[i][j]= sc.nextInt();
			}
			// end of innerloop
		}
		// end of outer loop
		
		
		System.out.println("Enter the elements for 2nd array:");
		//outer loop for rows
		for(int i=0;i<3;i++)
		{
			//inner loop for single row
			for(int j=0;j<3;j++)
			{
				arr2[i][j]= sc.nextInt();
			}
			// end of innerloop
		}
		// end of outer loop
		
		System.out.println();
		System.out.println("Enter the operation to perfom(add,sub,mul)");
		
		ch= sc.next().toLowerCase();
		
		switch(ch)
		{
			case "add": additionMatrix(arr1,arr2);
			            break;
			case "sub": subtractionMatrix(arr1,arr2);
			            break;
            case "mul": multiplicationMatrix(arr1,arr2);
			            break; 	
            default: System.out.println("No operation");
			            					
						
		} 
		
    

  }


}   