package assignment;
import java.util.InputMismatchException;
import java.util.Scanner;
public class AssignmentMain 
{
static String[] hotFoodMenu = {"1. Burger","2. Lasagne","3. Stew","4. Vegetable Soup","5. Chicken Soup","6. Sausages","7. Sausage Rolls","8. Vol Au Vent"+"\n9. Chicken Curry"};
static String[] sidesMenu = {"Chips","Beans","Crusty Roll","Rice","Peas","Wedges","Curly Fries"};
static String[] dipsMenu = {"Peppered Sauce","Curry","Gravy"};
static double[] hotFoodPrice = {4.50, 4.00,2.50,2.50,2.50,0.80,0.80,1.00,3.50};

public static void main(String[] args) 
	{
	int admin = 0;
	Scanner key = new Scanner(System.in);
	do 
	{
	
	
	System.out.print("\t\t\t\t Café name");
	
	System.out.print("\n\n\t\t\t Select your option: ");
	
	System.out.print("\n\n\t 1: User" + "\t 2: Admin" + "\t 3: Exit");
	
	System.out.print("\n\t\t\t\t Choice:");
	
	admin = key.nextInt();
	
	switch (admin)
	{
	case 1:
		menu();
	case 2:
		//Insert Admin Method
		System.out.print("Admin");
		break;
	}
	
	}while(admin != 3);
		
	}
	
public static void menu()
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
					System.out.print("\n\t You have selected a "+hotFoodMenu[0]+". Would you like the meal deal? It is £"+ hotFoodPrice[0]+0+" alone, with an extra 50p for the meal deal.");
					System.out.print("\n\t1. Meal Deal" + "\t\t2. Alone");
					choice = key.nextLine();
					if(choice2 = true)
					{
						//sides method
					}
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
			
				
			
			
		}
	}
		
}
	
	public static void sides()
	{
		String choice = "";
		boolean choice2 = false;
		Scanner key = new Scanner(System.in);
		
		
	}
	
}
	
	

