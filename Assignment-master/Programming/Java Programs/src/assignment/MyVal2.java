package assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyVal2 
{
	static Scanner key = new Scanner(System.in);
	
	public static int validInt2(int min, int max)
	{
		int num = 0;
		boolean ok;
		
		do 
		{
				try
				{
				ok = true;
				My.p("\n\n\t Enter Number: ");
				num = key.nextInt();
				key.nextLine();
				
				if(num < min || num > max)
				{
				ok = false;
				My.p(String.format("\n\tError: Range is %2d - %2d. Please re-enter.", min, max));
				key.nextLine();
				}
				}
				catch (InputMismatchException e)
				{
					My.p("\n\tError: Illegal character(s) in input - Please re-enter.");
					key.nextLine();
					ok = false;
				}
			}while(!ok);
		return num;
		}
	}
	