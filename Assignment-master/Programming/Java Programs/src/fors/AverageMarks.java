package fors;

import java.util.Scanner;


public class AverageMarks 
{
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		
		String name = "";
		
		Double English = 0.0, Maths = 0.0, IT = 0.0, Total = 0.0, Average = 0.0; 
		
		for(int count = 0; count < 5; count++)
			{
			System.out.print("\n\tPlease enter the student's name: ");
			name = key.nextLine();
			System.out.print("\n\tPlease enter the student's English score: ");
			English = key.nextDouble();
			System.out.print("\n\tPlease enter the student's Maths score: ");
			Maths= key.nextDouble();
			System.out.print("\n\tPlease enter the student's IT score: ");
			IT = key.nextDouble();
			
			key.nextLine();
			
			Total = English + Maths + IT;
			
			Average = Total / 3;
			
			System.out.print("\n\tThe student named " + name + " achieved " +English+ " in English, " +Maths+ " in Maths, and " +IT+ " in IT, with an average score of " +Average);
			
			}
		
	}
}
