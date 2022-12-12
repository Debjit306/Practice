/*
@author: DEBJIT TALUKDER
@Date :21sep,2022.
*/

class Pen
{
  private String brand;
  private String color;
  private double price;
  
  Pen()
  {
	   System.out.println("-------constructor 1------");
  }
  
  Pen(String brand)
  {   
      this();
	  System.out.println("-------constructor 2------");
	  this.brand=brand;
	  
  }
  
  Pen(String brand,String color, double price)
  {
	  this(brand);
	  System.out.println("-------constructor 3------");
	  this.price= price;
  }
  
  void display()
  {
	  System.out.println("Pen Brand:"+brand);
	  System.out.println("Pen Colour:"+color);
	  System.out.println("Pen Price:"+price);
	  
  }

  public static void main(String ... args)
  {
	  Pen p1= new Pen("LINC FLIGHT","Black",10);
	  p1.display();
	  
  }

}