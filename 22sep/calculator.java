/*
Program : Static calculator
@author: DEBJIT TALUKDER
@Date :22sep,2022.
*/
import java.util.Scanner;
class Calculator
{
	static double answer=0.0;
	
	double addition(double num1,double num2)
	{
		return num1+num2;
	}
	
	double subtraction(double num1,double num2)
	{
		return num1-num2;
	}
	double multiplication(double num1,double num2)
	{
		return num1*num2;
	}
	double division(double num1,double num2)
	{
		return num1/num2;
	}
	
	public static void main(String...args)
	{
		Scanner sc = new Scanner(System.in);
		double number1,number2;
		char operator,choice;
		
		System.out.println("--------------Calculator----------");
		System.out.println("Enter 2 numbers:");
		number1= sc.nextDouble();
		number2= sc.nextDouble();
		
		Calculator cal = new Calculator();
		while(true)
		{
			System.out.println("Enter the operator: ");
			operator= sc.next().charAt(0);
			switch(operator)
			{
				case '+': Calculator.answer= cal.addition(number1,number2);
				           break;
			    case '-': Calculator.answer= cal.subtraction(number1,number2);
				           break;
				case '*': Calculator.answer= cal.multiplication(number1,number2);
				           break;
			    case '/': Calculator.answer= cal.division(number1,number2);
				           break;
			   default: System.out.println("Wrong input");
			   
			}
			
			System.out.println(number1+" "+operator+ " "+number2+" = "+Calculator.answer);
			System.out.println("Do you want to perform more operation");
			choice= sc.next().toLowerCase().charAt(0);
			
			if(choice=='y')
			{
				number1= Calculator.answer;
				System.out.println("Enter the number: ");
				number2= sc.nextDouble();
			}
			
			else
			{
				break;
			}
			
		}
		
	}
	
	
}