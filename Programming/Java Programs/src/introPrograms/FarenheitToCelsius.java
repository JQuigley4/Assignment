package introPrograms;

import java.util.Scanner;

public class FarenheitToCelsius
{
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);

		
		double farenheit = 0, celsius = 0;
		
		
		
		System.out.print("\n\tPlease input the temperature in Farenheit:   ");
		farenheit = key.nextInt();
		
		celsius = ((farenheit -32)*5)/9;
		
		System.out.print("\n\tThe temperature in celsius is: "+celsius);
	
	}
}
