package whiles;

import java.util.Scanner;

public class While1 
{

	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		char choice = 'n';
		int age = 0, totalAge = 0, noOfChild = 0, noOfAdult = 0, noOfPeople = 0, error = 0;
		double avAge=0;
		do 
		{
			System.out.print("\n\tPlease enter the age: ");
			age = key.nextInt();
			key.nextLine();
			totalAge = totalAge + age;
			
			noOfPeople++;
			
			if(age >=18)
			{
				noOfAdult++;
			}
			else
			{
				noOfChild++;
			}
			
			System.out.print("\n\tDo you want to enter another age?: ");
			choice = key.next().charAt(0);
			
			
			do
			{
			if(choice == 'y' || choice == 'Y' || choice == 'n' || choice == 'N')
			{
				error = 0;
				
				
			}
			else
			{
				error = 1;
				System.out.print("\n\t Invalid choice, choose again. ");
				
				System.out.print("\n\tDo you want to enter another age?: ");
				choice = key.next().charAt(0);
			}
			}while(error == 1);
			
		} while(choice == 'Y' || choice == 'y' );
		
		avAge = (double)totalAge / noOfPeople;
		
		System.out.print("\n\tThe average age of "+noOfChild+ " children and "+noOfAdult+" adults is "+avAge+".");
	}

}
