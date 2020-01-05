package introPrograms;

import java.util.Scanner;


public class CircleCalculation 
{
//5 10 15
	static double pi = 3.141592;
	
	double circle = 0;
	
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);

		double circle = 0;
		double rad1 = 0, rad2 = 0, rad3 = 0;
		
		System.out.print("\n\tPlease input radius of smallest circle:   ");
		rad1 = key.nextInt();
		
		circle = pi * rad1 * rad1;
		
		System.out.print("\n\tThe smallest circle's area is: "+circle);
		
		circle = 0;
				
		System.out.print("\n\tPlease input radius of middle circle:   ");
		rad2 = key.nextInt();
		
		circle = pi * rad2 * rad2;
		
		System.out.print("\n\tThe middle circle's area is: "+circle);
		
		circle = 0;
		
		System.out.print("\n\tPlease input radius of largest circle:   ");
		rad3 = key.nextInt();
		
		circle = pi * rad3 * rad3;
		
		System.out.print("\n\tThe largest circle's area is: "+circle);
		
		circle = 0;
	}
}
