package introPrograms;

import java.util.Scanner;

public class AgeCalculation 
{

	
	
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);

		int birthYear = 0, currentYear = 0, age = 0;
		
		System.out.print("\n\tPlease input your Birth year:   ");
		birthYear = key.nextInt();
		
		System.out.print("\n\tPlease input the Current year:   ");
		currentYear = key.nextInt();
		
		age = currentYear - birthYear;
		
		System.out.print("\n\tYou are " +age+ " years old.");
	}

}
