package assignment;
import java.util.InputMismatchException;
import java.util.Scanner;
public class AssignmentMain 
{

	public static void main(String[] args) 
	{
		
		String choice = "";
		boolean choice2 = false;
		Scanner key = new Scanner(System.in);
		
		
		
		
		do
		{
		
		System.out.print("\t\t\t\t Café name");
		
		System.out.print("\n\n\t\t\t Select your option: ");
		
		System.out.print("\n\n\t 1: Sandwich" + "\t 2: Salads" + "\t 3: Hot food" + "\t 4: Exit");
		
		System.out.print("\n\t\t\t\t Choice:");
		
		choice = key.nextLine();
		
		choice2 = validInt(choice);
		if(choice2 = true)
		switch (choice)
		{
		case "1":
			//Insert Sandwich Method
			System.out.print("Sanwich");
			break;
		case "2":
			//Insert Salad Method
			System.out.print("Salad");
			break;
		case "3":
			//Insert Hot Food Method
			System.out.print("Hot Food");
			break;
		}
	
		
		}while(!"4".equals(choice));
	}
	
	
	
	public static boolean validInt(String choice) 
		{
			try 
			{
			Integer.parseInt(choice);
		  	return true;
			} 
			catch (NumberFormatException e) 
			{
			return false;
			} 
		}
	}

