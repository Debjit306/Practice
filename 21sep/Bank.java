/*
Program : creating class Bank to create accounts
@author: DEBJIT TALUKDER
@Date :21sep,2022.
*/

//declaring class Bank

class Bank
{
	//main method
	public static void main(String ...args)
	{
		//-------Constructor injection ------//tight coupling
		
		//declaring objects of Account class
		Account acc1= new Account(7289,"Pramit Kumar pal",5000.0);
		Account acc2= new Account(9276,"Deep Das",10020.0);
		
		// displaying the account
		System.out.println("Account ID:  "+acc1.getAccID()+"   Name:   "+acc1.getAccName()+"  Balance:  "+acc1.getBalance());
		System.out.println("Account ID:  "+acc2.getAccID()+"   Name:   "+acc2.getAccName()+"  Balance:  "+acc2.getBalance());
		
		
		//--------Getter Setter injection----------//loose coupling
		
		//declaring objects
		Account acc3= new Account();
		
		//setting the values of the object
		acc3.setAccID(1089);
		acc3.setAccName("Debjit Talukder");
		acc3.setBalance(5678.08);
		
		//getting the values
		System.out.println("Account ID:  "+acc3.getAccID()+"   Name:   "+acc3.getAccName()+"  Balance:  "+acc3.getBalance());
	}
	
}