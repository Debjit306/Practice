/*
Program : Understanding Varargs
@author: DEBJIT TALUKDER
@Date :23sep,2022.
*/

class VarargsDemo
{
   static void printArray(int []ar)
   {
	  
	   for(int i:ar)
	   {
		   System.out.print(i+ "  ");
	   }
	    System.out.println("------------------------");
   }
   
    static void printArraybetter()
   {
	   System.out.println("---------empty---------------");
	    
	   
   }
   
   static void printArraybetter(int ...ar)
   {
	   System.out.println("---------in ints---------------");
	     for(int i:ar)
	   {
		   System.out.print(i+ "  ");
	   }
	    System.out.println("------------------------");
	   
   }
   
   static void printArraybetter(String ...ar)
   {
	   System.out.println("-------------in strings-----------");
	     for(String i:ar)
	   {
		   System.out.print(i+ "  ");
	   }
	    System.out.println("------------------------");
	   
   }
   
   static void printArraybetter(float ...ar)
   {
	   System.out.println("-------------in float-----------");
	     for(float i:ar)
	   {
		   System.out.print(i+ "  ");
	   }
	    System.out.println("------------------------");
	   
   }
   
   /*static void printVarargs(int... x1, int ...x2)
   {
	   
   }*/
   
  /* static void printElements(int...x1,int x2)
   {
	   for(int i: x1)
	   {
		   System.out.println(i+ "      " );
	   }
	  
   }*/
   
   static void printElements(int x1,int ...x2) 
   {
	   System.out.println(x1);
	   for(int i: x2)
	   {
		   System.out.println(i+ "      " );
	   }
	  
   }


   public static void main(String...args)//ellipse operator
   {
	   int a1[]={1,2,3};
	   int a2[]={6,7,9,8};
	   int a3[]={5,35,78,9,76,65};
	   
	   //printArray(a1);
	   //printArray(a2);
	   //printArray(a3);
	   
	   printArraybetter(6,4,5,4,2);
	   printArraybetter(67,34,231,55,11);
	   printArraybetter("Ram","shyam","Sita");
	   printArraybetter(67.3f,68.0f,34.8f);
	   
	   printArraybetter();//  ambiguity overloading varargs
	   
	  // printVarargs(8,7,4,3,2,1,3);
	  
	  printElements(5,3,2,5,8);
  	   
   }

}
//Rules of Varargs:
//1. Varargs can be overloaded
//2. In a method there can be only 1 varargs
//3. varargs element has to be last element