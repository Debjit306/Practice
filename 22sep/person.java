/*
Progaram : Static variable VS Instance variable
@author: DEBJIT TALUKDER
@Date :22sep,2022.
*/

class Person
{
	//instance variable
	private String name;
	private int age ;
	private String gender;
	private static String colony;
	static int counter;
	
	Person()
	{
		
	}
	Person(String name, int age,String gender)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
		counter++;
		colony="Gokul Dham";
	}
	
	//static method can acess only static variable and they can access instance variable through oject
		
	void display()
	//non static method can access both static and non static variable
	{
		colony="Gokul Dham";
		System.out.println("Name:   "+this.name +"  Age:  "+this.age+"  Gender:  "+this.gender+"  Colony:  "+colony);
	}
	
}

