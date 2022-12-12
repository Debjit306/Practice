/*
*/
class Student
{
	private int rollno;
	private String name;
	private float marks;
	
	Student()
	{
		
	}
	
	Student(int rollno,String name,float marks)
	{
		this.rollno=rollno;
		this.name=name;
		this.marks=marks;
	}
	
	void setRollno(int rollno)
	{
		this.rollno=rollno;
	}
	
	int getRollno()
	{
		return this.rollno;
	}
	
	void setName(String name)
	{
		this.name= name;
	}
	
	String getName()
	{
		return this.name;
	}
	
	void setMarks(float marks)
	{
		this.marks=marks;
	}
	
	float getMarks()
	{
		return this.marks;
	}
	
	
}