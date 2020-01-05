package introPrograms;

import java.util.Scanner;

public class Remainder 
{

	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);

		
		int int1 = 0, int2 = 0, remainder = 0, ans = 0;
		
		System.out.print("\n\tPlease your first number:   ");
		int1 = key.nextInt();
		
		System.out.print("\n\tPlease your second number:   ");
		int2 = key.nextInt();
		
		ans = int1 / int2;
		remainder = int1 % int2;
		
		
		
		
		System.out.print("\n\t" + int1 + " / "+ int2+ " = " +ans+ " with a remainder of "+remainder);
		
		
	}

}
