package introPrograms;

import java.util.Scanner;

public class FutureAgeCalculation 
{

	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);

		int futureYear = 0, currentYear = 0, age = 0, futureAge = 0;
		
		System.out.print("\n\tPlease input your age:   ");
		age = key.nextInt();
		
		System.out.print("\n\tPlease input the Current year:   ");
		currentYear = key.nextInt();
		
		System.out.print("\n\tPlease input a Future year:   ");
		futureYear = key.nextInt();
		
		futureAge = (futureYear - currentYear) + age;
		
		System.out.print("\n\tYou will be " +futureAge+ " years old.");
	}
	
}
