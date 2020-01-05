package introPrograms;

import java.util.Scanner;

public class Cuboid 
{
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);

		double circle = 0;
		
		double length = 0, breadth = 0, height = 0;
		
		double perim = 0;
		
		double surfArea = 0;
		
		double vol = 0;
		
		System.out.print("\n\tPlease input the length of the cuboid:   ");
		length = key.nextInt();
		
		
		
				
		System.out.print("\n\tPlease input the breadth/width of the cuboid:   ");
		breadth = key.nextInt();

		

		System.out.print("\n\tPlease input the height of the cuboid:   ");
		height = key.nextInt();
		
		perim = (length*4) + (breadth*4) + (height*4);
		
		surfArea= ((length*breadth)*2) + ((breadth*height)*2) + ((length*height)*2); 
		
		vol = length *breadth* height;
		
		System.out.print("\n\tThe cuboid has a perimiter of" +perim +", a surface area of " +surfArea+" and a volume of "+vol);
		
		circle = 0;
	}
}
