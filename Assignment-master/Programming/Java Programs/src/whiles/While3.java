package whiles;

import java.util.Scanner; 

public class While3 
{

	public static void main(String[] args) 
	{
		double height = 0, bounces = 0, bounceHeight = 0, percentage = 0;
		Scanner key = new Scanner(System.in);
		
		System.out.print("Input height: ");
		height = key.nextDouble();
		
		do
		{
			//percentage = (height * 5)/100;
			height = height * 0.95;
			bounces++;
			//System.out.print("\nThe ball bounces "+bounces+" times.");
		}while(height > 0.5);
		
		System.out.print("The ball bounces "+bounces+" times.");
	}

}
