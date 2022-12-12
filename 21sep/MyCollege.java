/*
Program : creating class MyCollege to create College Students
@author: DEBJIT TALUKDER
@Date :21sep,2022.
*/

//declaring class MyCollege

class MyCollege
{
	//main method
	public static void main(String ...args)
	{
		//-------Constructor injection ------//tight coupling
		
		//declaring objects of Account class
		
		CollegeStudent s1= new CollegeStudent(47732,"Ankit Chakraborty",new String[]{".Net","Science","Maths"});
		
		// displaying the account
		System.out.println("Student ID:  "+s1.getStudentID()+"   Name:   "+s1.getStudentName());
		
		// printing the array of subjects
		System.out.println("Subjects :");
		String []subjectsArrays= s1.getSubjects();
        for(int i=0;i<subjectsArrays.length;i++)
        {
			System.out.print("  "+subjectsArrays[i]);
		}			
		System.out.println();
		System.out.println();
		
	
      
		
		
		 //--------Getter Setter injection----------//loose coupling
		
		//declaring objects
		CollegeStudent s3= new CollegeStudent();
		
		//setting the values of the object
		s3.setStudentID(103);
		s3.setStudentName("Ayan Singh");
		s3.setSubjects(new String[]{"c","Sql"});
		
		
		CollegeStudent s4= new CollegeStudent();
		
		//setting the values of the object
		s4.setStudentID(104);
		s4.setStudentName("Sweety Banerjee");
		s4.setSubjects(new String[]{"Java","Oracle","Sql"});
		
		// displaying the account
		// displaying the account
		System.out.println("Student ID:  "+s3.getStudentID()+"   Name:   "+s3.getStudentName());
		
		// printing the array of subjects
		System.out.println("Subjects :");
		subjectsArrays= s3.getSubjects();
        for(int i=0;i<subjectsArrays.length;i++)
        {
			System.out.print("  "+subjectsArrays[i]);
		}			
		System.out.println();
		System.out.println();
		
		
		
		System.out.println("Student ID:  "+s4.getStudentID()+"   Name:   "+s4.getStudentName());
		
		// printing the array of subjects
		System.out.println("Subjects :");
		subjectsArrays= s4.getSubjects();
        for(int i=0;i<subjectsArrays.length;i++)
        {
			System.out.print("  "+subjectsArrays[i]);
		}			
		System.out.println();
		System.out.println();
		
	}
	
}