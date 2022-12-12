/*
Program: Declaring a class and its objects
@author: DEBJIT TALUKDER
@Date :20sep,2022.
*/
//declaring a theatre class

import java.util.*;
class Theatre
{
  // declaring properties
  private String movieName;
  private String movieTime;
  private double ticketPrice;
  
  //method to insert Movie
  void insertMovie()
  {
	  Scanner sc= new Scanner(System.in);
	  
	   System.out.println("Enter the details of Movie:");
	   
	   System.out.println("Movie Name:");
	   this.movieName= sc.next();
	   
		System.out.println("Movie Time:");
		this.movieTime= sc.next();
		
		System.out.println("Ticket Price:");
		this.ticketPrice= sc.nextDouble();
    
  }
  
  //method to display movie
  void displayMovie()
  {
    System.out.println("Movie Name:"+ this.movieName+"    "+ "Time:"+ this.movieTime+ "   "+"Ticket Price:"+this.ticketPrice);
  }
  
}
// end class 

//declaring class Theatre
class MovieInput
{
	
   //main method
	public static void main(String ...args)
	{		
		Theatre movie1;
		movie1= new Theatre();
		movie1.insertMovie(); // explicit
		
		Theatre movie2= new Theatre();
		movie2.insertMovie();
		
		Theatre movie3= new Theatre();
		movie3.insertMovie();
		
		System.out.println();
		System.out.println("---------------------My Theatre----------------------");
		//display all the movie
		movie1.displayMovie();
		movie2.displayMovie();
		movie3.displayMovie();
		System.out.println("---------------------------------------------------");
	}
	
}