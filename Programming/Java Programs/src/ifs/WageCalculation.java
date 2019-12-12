package ifs;

import java.util.Scanner;

public class WageCalculation 
{
	public static void main(String[] args) 
	{
	
		Scanner key = new Scanner(System.in);

		
		double age = 0, wage = 0, hoursWorked = 0, under18 = 4.20, eighteenToTwenty = 5.90, twentyOneToTwentyFour = 7.38, twentyFivePlus = 7.83; 
	
		System.out.print("Please input your age: ");
		age = key.nextDouble();
		
		System.out.print("Please input your worked hours: ");
		hoursWorked = key.nextDouble();
		
		if(age < 18)
		{
			wage = hoursWorked * under18;
		}
		else if((age >= 18 ) && (age < 21))
		{
			wage = hoursWorked * eighteenToTwenty;
		}
		else if ((age >= 21) && (age < 25))
		{
			wage= hoursWorked * twentyOneToTwentyFour;
		}
		else 
		{
			wage= hoursWorked * twentyFivePlus;
		}
	
		System.out.print("Your wage is £"+wage);
	
	
	
	}
}
