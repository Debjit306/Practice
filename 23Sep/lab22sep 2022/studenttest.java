/**/

class StudentTest
{
	public static void main(String ...args)
	{
		Student s[] = new Student[5];
		/* for(int i=0;i<5;i++)
		{
			s[i]= new Student();
		} */
		
		s[0]= new Student(22,"Mitul", 89);
		s[1]= new Student(33,"Prithwish",98);
		s[2]= new Student(44,"Royston",90);
		s[3]= new Student(55,"Sonu",88);
		s[4]= new Student(66,"Ayan",78);
		
		for(int i=0;i<5;i++)
		{
			if((s[i].getMarks())>=90)
			{
				System.out.println("Name:  "+s[i].getName());
			}
			
		}
		
		
		
	}
	
	
}