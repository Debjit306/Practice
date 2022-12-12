/*
Program: Understanding Java Bean and encapuslation
@author: DEBJIT TALUKDER
@Date :21sep,2022.
*/

//declaring a class Account

class Account
{
	//declaring instance variable
	
	private int accID;
	private String accName;
	private double balance;
	
	//default constructor no arg constructor
    Account()
	{
		
	}
	
	//parameterized constructor
	Account(int accID,String accName,double balance)
	{
		this.accID=accID;
		this.accName=accName;
		this.balance=balance;
		
	}
	
	//getters(accessors) and setters(mutators)
	public int getAccID()
	{
		return this.accID;
	}
	
	public void setAccID(int accID)
	{
		this.accID=accID;
	}

	//////////////////////////////
	public String getAccName()
	{
		return this.accName;
	}
	
	public void setAccName(String accName)
	{
		this.accName=accName;
	}
	
	//////////////////////////////
	public double getBalance()
	{
		return this.balance;
	}
	
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
}