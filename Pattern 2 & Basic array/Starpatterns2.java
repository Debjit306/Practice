/*
println(new line)
print(no new line) 
@author: DEBJIT TALUKDER
@Date: 14sep,2022.
*/

class StarsPattern2
{
	/*   noOfRows=4
	      *  i=1  spaces: 3(noOfrows-i)  
        * *  i=2          2
      * * *  i=3          1
    * * * *	 i=4          0
	
	*/
	
		static void firstPattern(int noOfRows)
	{
		for(int i=1;i<=noOfRows;i++)
		{
			System.out.println();
			for(int spaces=noOfRows-i;spaces>0;spaces--)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			
		}
		
		
	}
	
	/*	
	   *
	  * *
	 * * *
	* * * * 
	*/
	
	static void secondPattern(int noOfRows)
	{
		for(int i=1;i<=noOfRows;i++) // outer loop for my rows
		{
			System.out.println(); // new line after each row
			
			for(int spaces=noOfRows;spaces>i;spaces--)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			
			
		}
		
		
	}
	
		
   public static void main(String... args)
   {
	  int number =Integer.parseInt(args[0]);
	 // firstPattern(number);
	  secondPattern(number);
      
   }


}
