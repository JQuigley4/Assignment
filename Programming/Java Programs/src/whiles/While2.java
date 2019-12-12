package whiles;

import java.util.Scanner;

public class While2 
{
	
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		double number = 0, inputs = 0, total = 0, avNum = 0;
		
		do
		{
			System.out.print("Input number: ");
			number = key.nextDouble();
			if(number!= -999)
			{
				total = total + number;
				inputs++;
				
			}
		}while(number != -999);
		avNum = total/inputs;
		
		System.out.print("Total is "+total+ " with an average of "+avNum);
	}
}
