/*
Wrapper classes
@author: DEBJIT TALUKDER
@Date :23sep,2022.
*/

class WrapperDemo
{
  public static void main(String args[])
  {
	  int primitiveA=5;
	  Integer objectA = Integer.valueOf(primitiveA);
	  
	  //objectA= ;
	  // autoboxing conversion of primitive to object
	  
	  //After java 5
	  objectA= primitiveA;
	  
	  
	  //object into primitive: Unboxing
	  
	  //Integer i = new Integer(5);
	  Integer i=5;
	 // int num= i.intValue();
	  
       int num;
	   num=i;// Unboxing
	   
	   
	  // Integer t1= new Integer(6);
	  Integer t1=6;
	   
	   t1++;// autoboxing
	   
	   //--------------------------------------------------------------//
	   
	   Integer g1= 127;
	   Integer g2=127;
	   System.out.println(g1.hashCode());
	   System.out.println(g2.hashCode());// pool -128 to 127 ,, Character and Boolean
	   
	   
	   System.out.println(g1==g2); // -128 to 127
	   
	   Integer g3=128;
	   Integer g4= 128;
	   System.out.println(g3.hashCode());
	   System.out.println(g4.hashCode());
	   
	    System.out.println(g3==g4);
	   
	   
	   Float f1= 2f;
	   Float f2= 2f;
	   
	    System.out.println(f1==f2);
	   
	   
	   
	   
	   
  }

}