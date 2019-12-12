package introPrograms;

import java.util.Scanner;

public class Cone 
{
	static double pi = 3.141592;
	
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);

		
		double rad = 0, height = 0, surfArea = 0, vol = 0;
		
		
		
		System.out.print("\n\tPlease input the radius:   ");
		rad = key.nextInt();
		
		System.out.print("\n\tPlease input the height:   ");
		height = key.nextInt();
		
		surfArea = (pi * rad * height) + pi * (rad*rad);
		
		vol = (pi*(rad*rad))*(height/3);
		
		System.out.print("\n\tThe surface area of the cone is: "+surfArea + " and the volume is: "+vol);
	
	}
}
