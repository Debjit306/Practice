/*
Program: Understanding Java Bean and arrays
@author: DEBJIT TALUKDER
@Date :21sep,2022.
*/

//declaring a class CollegeStudent

class CollegeStudent
{
	//declaring instance variable
	
	private int studentID;
	private String studentName;
	private String[] subjects;
	
	//default constructor no arg constructor
   CollegeStudent()
	{
		
	}
	
	//parameterized constructor
	CollegeStudent(int studentID,String studentName,String[] subjects)
	{
		this.studentID=studentID;
		this.studentName=studentName;
		this.subjects=subjects;
		
	}
	
	//getters(accessors) and setters(mutators)
	public int getStudentID()
	{
		return this.studentID;
	}
	
	public void setStudentID(int studentID)
	{
		this.studentID=studentID;
	}

	//////////////////////////////
	public String getStudentName()
	{
		return this.studentName;
	}
	
	public void setStudentName(String studentName)
	{
		this.studentName=studentName;
	}
	
	//////////////////////////////
	public String[] getSubjects()
	{
		return this.subjects;
	}
	
	public void setSubjects(String[] subjects)
	{
		this.subjects=subjects;
	}
}