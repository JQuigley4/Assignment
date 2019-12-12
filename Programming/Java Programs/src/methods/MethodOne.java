package methods;

import java.util.Scanner;

public class MethodOne 
{

	public static void main(String[] args) 
	{
		double num1 = 0, num2 = 0; 

		boolean mult = false;
		
		Scanner key = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		num1 = key.nextDouble();
		
		System.out.print("Enter second number: ");
		num2 = key.nextDouble();
		
		mult = multiple(num1, num2);
		
		System.out.print("It is " +mult+ " that "+num1+ " is a multiple of "+num2);
		
	}

	public static boolean multiple(double num1, double num2)
	{
		if (num1 % num2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
}
