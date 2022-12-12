/*
Program: Declaring a class and its objects
@author: DEBJIT TALUKDER
@Date :20sep,2022.
*/
//declaring a theatre class
class Theatre
{
  // declaring properties
  private String movieName;
  private String movieTime;
  private double ticketPrice;
  
   Theatre()// default constructor
  {
	  
  } 
  
 //paramterized constructor
  Theatre(String movieName,String movieTime,double ticketPrice)
  {
    this.movieName=movieName;
	this.movieTime=movieTime;
	this.ticketPrice=ticketPrice;
  }	
  
  //method to display movie
  void displayMovie()
  {
    System.out.println("Movie Name:"+ this.movieName+"    "+ "Time:"+ this.movieTime+ "   "+"Ticket Price:"+this.ticketPrice);
  }
  
}
// end class 

//declaring class Theatre
class MovieArray
{
	//main method
	public static void main(String ...args)
	{
		Theatre movies[] = new Theatre[5]; // creates an array of movies
		//creating objects
		movies[0]= new Theatre("Inception","3pm,6pm",500);
		movies[1]= new Theatre("Burfi","10am,5pm",275);
		movies[2]= new Theatre("Brahamastra","11pm,9pm",600);
		movies[3]= new Theatre("The Pianist","2pm,10pm",400);
		movies[4]= new Theatre("Harry Potter","5pm,8pm",475);
		//movies[5]= new Theatre("ABC","5pm,8pm",475);
		
		// displaying all the movies in the theatre
		for(int i=0; i<movies.length;i++)
		{
			movies[i].displayMovie();
		}
		
		
		Theatre m1= new Theatre();
		m1.displayMovie();
		
	}
	
}