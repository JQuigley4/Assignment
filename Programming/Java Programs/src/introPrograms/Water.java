package introPrograms
;

import java.util.Scanner;

public class Water 
{

	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);

		
		int output = 650, water = 10000, weeks = 0;
	
		while(water > 0)
		{
			water = water - output;
			weeks = weeks + 1;
			
			if(water <0)
			{
				weeks=weeks-1;
			}
				
		}

	System.out.print("\n\tThe water will last for "+weeks+" weeks.");
}

}