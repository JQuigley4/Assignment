package assignment;
import java.util.InputMismatchException;
import java.util.Scanner;
public class AssignmentMain 
{
static String[] hotFoodMenu = {"1. Burger","2. Lasagne","3. Stew","4. Vegetable Soup","5. Chicken Soup","6. Sausages","7. Sausage Rolls","8. Vol Au Vent"+"\n9. Chicken Curry"};
double[] hotFoodPrice = {4.50, 4.00,2.50,2.50,2.50,0.80,0.80,1.00,3.50};

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
			hotFood();
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
	

	
	public static void hotFood()
	{
		String choice = "";
		boolean choice2 = false;
		Scanner key = new Scanner(System.in);
		
		System.out.print("\t\t\t\t Café name");
		
		System.out.print("\n\n\t\t\t Select your option: ");
		
		System.out.print("\n\n\t1: Main "+ "\t2: Side ");
		
		System.out.print("\n\t\t\t\t Choice:");
		
		choice = key.nextLine();
		choice2 = validInt(choice);
		
		if(choice2 = true)
			{
			//System.out.print("\n\n\t 1: Burger £4.50" + "\t 2: Lasagne £4.00" + "\t 3: Stew £2.50" + "\t 4: Vegetable Soup £2.50"
							//+"\n\n\t 5: Chicken Soup £2.50" + "\t 6: Sausages £0.80" + "\t 7: Sausage Rolls £0.80" + "\t 8: Vol Au Vent £1" + 
							//"\t 9: Chicken Curry"	);
		    for (int i = 0; i < hotFoodMenu.length; i++) {
		        System.out.println(hotFoodMenu[i]);
		      }
		   
			
			System.out.print("\n\t\t\t\t Choice:");
			
			choice = key.nextLine();
			
			choice2 = validInt(choice);
			if(choice2 = true) 
			{
				switch (choice)
				{
				case "1":
				
					break;
				case "2":
				
					break;
				case "3":
				
					break;
				case "4":
				
					break;
				case "5":
	
					break;
				case "6":
				
					break;
				case "7":
				
					break;
				case "8":
				
					break;
				case "9":
				
					break;
				}
			
				
			{
				System.out.print("\n\n\t 1: Sandwich" + "\t 2: Salads" + "\t 3: Hot food" + "\t 4: Exit");
		
				System.out.print("\n\t\t\t\t Choice:");
		
				choice = key.nextLine();
		
				choice2 = validInt(choice);
				if(choice2 = true)
					switch (choice)
					{
					case "1":
			
						break;
					case "2":
			
						break;
					case "3":
			
						break;
					}
				
			}
			
		}
	}
		
}
}
	
	

