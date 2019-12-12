package general;

import java.util.Scanner;

public class MyVal 
{

	static Scanner key = new Scanner(System.in);
	
	public static int validInt(int min, int max)
	{
		int num = 0;
		boolean ok;
		
		do
		{
			ok = true;
			My.p("\n\n\t Enter Number: ");
			
			if(!key.hasNextInt())
			{
				My.p(String.format("\n\t Please enter a number (%2d - %2d)", min, max));
				key.nextLine();
				ok = false;
			}
			else
			{
				num = key.nextInt();
				
				if(num < min || num > max)
					{
					ok = false;
					My.p(String.format("\n\tError: Range is %2d - %2d. Please re-enter.", min, max));
					key.nextLine();
					}
			}
			
		}while(!ok);
		return num;
	}
	
}
