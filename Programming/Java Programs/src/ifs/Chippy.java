package ifs;

import java.util.Scanner;
import general.*;

public class Chippy
{

	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		
		double total = 0, amountTendered = 0, change = 0;
		int itemChoice = 0;
		
		
		System.out.print("\t\n1. Cheeseburger £4.99");
		System.out.print("\t\n2. Pepsi £2");
		System.out.print("\t\n3. Chips £2.50");
		System.out.print("\t\n4. Mexican Beef £5");
		System.out.print("\t\n5. Pizza £6");
		System.out.print("\t\nPlease select the item that you want");
		itemChoice = MyVal2.validInt2(1, 5);

		
			/*if(itemChoice == 1)
			{
				total = total + 4.99;
			}
			else if(itemChoice == 2)
			{
				total = total + 2;
			}
			else if(itemChoice == 3)
			{
				total = total + 2.50;
			}
			else if(itemChoice == 4)
			{
				total = total + 5;
			}
			else if (itemChoice == 5)
			{
				total = total + 6;
			}*/
			
			
		switch(itemChoice)
		{
			case 1:
				total = total + 4.99;
				break;
			
			case 2:
				total = total + 2;
				break;
			
			case 3:
				total = total + 2.50;
				break;	
			
			case 4:
				total = total + 5;
				break;
			
			case 5:
				total = total + 6;
				break;
			
			default: 
				System.out.print("Invalid option");
				break;
		}
		
		
		
		
		
		
		
		
		System.out.print("Your total is £" + total);
		System.out.print("Please select your payment amount");
		amountTendered = key.nextDouble();
		
		
		
		
	}

}
