/*
@author: DEBJIT TALUKDER
@Date :21sep,2022.
*/
class A
{

  private int value;// instance variable
  
  A()
  {}
  
  A(int value)
  {
    this.value=value;
  }
  
  void calc()
  {
     int value= 7 ;// local variable
	 int sum= value;// refers to the value is 7
	 
	 int b = this.value /// print 3
	 
	 System.out.println(sum);
  }
 public static void main(String...args)
 {
	 A a1 = new A(3);
	 a1.calc();
 }

}