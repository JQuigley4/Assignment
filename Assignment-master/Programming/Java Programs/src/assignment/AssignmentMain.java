package assignment;
import java.util.InputMismatchException;
import java.util.Scanner;
public class AssignmentMain 
{
	//Arrays containing hot food menu items, along with sides, dips and the prices for each main item. JQ. 
static String[] hotFoodMenu = {"1. Burger","2. Lasagne","3. Stew","4. Vegetable Soup","5. Chicken Soup","6. Sausages","7. Sausage Rolls","8. Vol Au Vent"+"\n9. Chicken Curry"};
static String[] sidesMenu = {"Chips","Beans","Crusty Roll","Rice","Peas","Wedges","Curly Fries"};
static String[] dipsMenu = {"Peppered Sauce","Curry","Gravy"};
static double[] hotFoodPrice = {4.50, 4.00,2.50,2.50,2.50,0.80,0.80,1.00,3.50,};
int small = 2, medium = 4, saladSize = 0, meatChoice = 0, saladChoice = 0, sauceChoice = 0;
double large = 4.75, totalBill = 0;
char additionalMeat;
int[] meats = {0, 1};
int[] salads = {0, 1, 2, 3, 4, 5};
int[] sauces = {0};
Scanner key = new Scanner(System.in);
//Main class, contains user/admin login JQ
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
//Menu method JQ
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
		System.out.print("Sandwich");
		break;
	case "2":
		salad();
		break;
	case "3":
		hotFood();
		break;
	}
	
	}while(!"4".equals(choice));
}
	//Validation method for the Choice variable
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
	
	//Main method for hot food JQ
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
		    for (int i = 0; i < hotFoodMenu.length; i++) 
		    	{
		        System.out.println(hotFoodMenu[i] + hotFoodPrice[i] +"0");
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
						sides();
					}
					break;
				case "2":
					System.out.print("\n\t You have selected a "+hotFoodMenu[1]+". Would you like the meal deal? It is £"+ hotFoodPrice[1]+0+" alone, with an extra 50p for the meal deal.");
					System.out.print("\n\t1. Meal Deal" + "\t\t2. Alone");
					choice = key.nextLine();
					if(choice2 = true)
					{
						sides();
					}
					break;
				case "3":
					System.out.print("\n\t You have selected a "+hotFoodMenu[2]+". Would you like the meal deal? It is £"+ hotFoodPrice[2]+0+" alone, with an extra 25p for the meal deal.");
					System.out.print("\n\t1. Meal Deal" + "\t\t2. Alone");
					choice = key.nextLine();
					if(choice2 = true)
					{
						sides();
					}
					break;
				case "4":
					System.out.print("\n\t You have selected a "+hotFoodMenu[3]+". Would you like the meal deal? It is £"+ hotFoodPrice[3]+0+" alone, with an extra 25p for the meal deal.");
					System.out.print("\n\t1. Meal Deal" + "\t\t2. Alone");
					choice = key.nextLine();
					if(choice2 = true)
					{
						sides();
					}
					break;
				case "5":
					System.out.print("\n\t You have selected a "+hotFoodMenu[4]+". Would you like the meal deal? It is £"+ hotFoodPrice[4]+0+" alone, with an extra 25p for the meal deal.");
					System.out.print("\n\t1. Meal Deal" + "\t\t2. Alone");
					choice = key.nextLine();
					if(choice2 = true)
					{
						sides();
					}
					break;
				case "6":
					System.out.print("\n\t You have selected a "+hotFoodMenu[5]+". It is £"+ hotFoodPrice[5]+0+".");
					System.out.print("\n\t1. Meal Deal" + "\t\t2. Alone");
					choice = key.nextLine();
					if(choice2 = true)
					{
						sides();
					}
					break;
				case "7":
					System.out.print("\n\t You have selected a "+hotFoodMenu[6]+". It is £"+ hotFoodPrice[6]+0+".");
					System.out.print("\n\t1. Meal Deal" + "\t\t2. Alone");
					choice = key.nextLine();
					if(choice2 = true)
					{
						sides();
					}
					break;
				case "8":
					System.out.print("\n\t You have selected a "+hotFoodMenu[7]+". It is £"+ hotFoodPrice[7]+0+".");
					System.out.print("\n\t1. Meal Deal" + "\t\t2. Alone");
					choice = key.nextLine();
					if(choice2 = true)
					{
						sides();
					}
					break;
				case "9":
					System.out.print("\n\t You have selected a "+hotFoodMenu[8]+". Would you like the meal deal? It is £"+ hotFoodPrice[8]+0+" alone, with an extra 50p per side, to a max of two.");
					System.out.print("\n\t1. Meal Deal" + "\t\t2. Alone");
					choice = key.nextLine();
					if(choice2 = true)
					{
						sides();
					}
					break;
				}
		}		
	}
}
	//Method for handling side orders JQ
			public static void sides()
			{
				String choice = "";
				boolean choice2 = false;
				Scanner key = new Scanner(System.in);
				
				for (int i = 0; i < sidesMenu.length; i++) 
		    	{
		        System.out.println(sidesMenu[i]);
		    	}
				choice = key.nextLine();
			}
			
			public static void salad()
			{
				Scanner key = new Scanner(System.in);
				int small = 2, medium = 4, saladSize = 0, meatChoice = 0, saladChoice = 0, sauceChoice = 0;
				double large = 4.75, totalBill = 0;
				char additionalMeat;
				int[] meats = {0, 1};
				int[] salads = {0, 1, 2, 3, 4, 5};
				int[] sauces = {0};
				
				System.out.print("\t\tWELCOME TO THE SALAD MENU\n\n1. Small = £2 one meat, Two Salad. \n2. Medium = £4 two meat and four salad. \n3. Large = £4.75 two meat and six salad\n\n\n\tPlease enter the size of salad you would like:  ");
				saladSize = key.nextInt();
		//do while loop used in case user enters incorrect entry\\
				do
				{		
					if (saladSize < 1 || saladSize > 3)
						System.out.print("\n\n\tInvalid entry, please re-enter your size choice.");

				} while (saladSize < 1 || saladSize > 3);
				
				if (saladSize == 1)
				{
					System.out.print("You have chosen a small salad");
				}
				else if (saladSize == 2)
				{
					System.out.print("You have chosen a medium salad");
				}
				else if (saladSize == 3)
				{
					System.out.print("You have chosen a large salad");
				}
		// ................................................		
		//Meat Selection appears showing all options for customer\\
		// ................................................		
				System.out.print("\n\n\t\tMEAT SELECTION\n1.Grilled Chicken\n2.Breaded Chicken\n3.Ham\n4.Peperoni\n5.Turkey\n6.Steak\n7.Tuna\n8.Chicken Supreme\n9.Taco Chicken\n10.Chicken Tikka");
		//Conditional loop used inside if statement so that customers get the correct meat choices according to their salad size choice//
				if(saladSize ==1)
				for (int i = 0; i < 1; i++)
				{
					System.out.print("\n\n\tPlease enter your meat choice(s):     ");
					meatChoice = key.nextInt(meats[i]);
					selectmeatChoice(meatChoice);
				}
				else 
					for (int i = 0; i < 2; i++)
					{
						System.out.print("\n\n\tPlease enter your meat choice(s):     ");
						meatChoice = key.nextInt(meats[i]);
						selectmeatChoice(meatChoice);
					}
				
				System.out.print("\n\n\t\tSALAD SELECTION\n1.Lettuce\n2.Tomato\n3.Onion\n4.Peppers\n5.Cucumber\n6.Sweetcorn\n7.Cheese\n8.Pickles\n9.Rice\n10.Egg\n11.Spinach\n12.Coleslaw");
		// ................................................
		// If statement used to make sure the correct quantity of salad choices is given
		// ................................................
				if(saladSize ==1)
					for (int i = 0; i < 2; i++)
					{
						System.out.print("\n\n\tPlease enter your salad choice(s):     ");
						saladChoice = key.nextInt(salads[i]);
						selectsaladChoice(saladChoice);	
					}
					else if(saladSize ==2)
						for (int i = 0; i < 4; i++)
						{
							System.out.print("\n\tPlease enter your salad choice(s):     ");
							saladChoice = key.nextInt(salads[i]);
							selectsaladChoice(saladChoice);	
						}
					else
						for (int i = 0; i < 6; i++)
						{
							System.out.print("\n\tPlease enter your salad choice(s):     ");
							saladChoice = key.nextInt(salads[i]);
							selectsaladChoice(saladChoice);		
						}
			
				System.out.print("\n\n\t\tSAUCE SELECTION\n1.Mayo\n2.Taco\n3.BBQ\n4.Ketchup\n5.HP Brown Sauce");
				
				System.out.print("\n\tPlease enter your sauce choice:     ");
				sauceChoice = key.nextInt(sauces[0]);
				selectsauceChoice(sauceChoice);
		// ................................................
		// If statement used to find correct bill for user
		// ................................................
				if (saladSize == 1)
				{
					System.out.print("Your salad has come to £2, enjoy!");
				}
				else if (saladSize == 2)
				{
					System.out.print("Your salad has come to £4, enjoy!");
				}
				else if (saladSize == 3)
				{
					System.out.print("Your salad has come to £4.75, enjoy!");
				}
				
		 }
			// ................................................
			// Method to select which meat you want
			// ................................................
			public static void selectmeatChoice(int meatChoice)
			{
				switch (meatChoice)
				{
				case 1:
					System.out.print("\nYou have chosen the Grilled Chicken");
					break;
				case 2:
					System.out.print("\nYou have chosen the Breaded Chicken");
					break;
				case 3:
					System.out.print("\nYou have chosen the Ham");
					break;
				case 4:
					System.out.print("\nYou have chosen the Peperoni");
					break;
				case 5:
					System.out.print("\nYou have chosen the Turkey");
					break;
				case 6:
					System.out.print("\nYou have chosen the Steak");
					break;
				case 7:
					System.out.print("\nYou have chosen the Tuna");
					break;
				case 8:
					System.out.print("\nYou have chosen the Chicken Supreme ");
					break;
				case 9:
					System.out.print("\nYou have chosen the Taco Chicken");
					break;
				case 10:
					System.out.print("\nYou have chosen the Chicken Tikka");
					break;
				default:
					System.out.print("\nInvalid meat option selected!");
				}
			}
		// ................................................
			
			// ................................................
			// ................................................
			// Method to select which salad you want
			// ................................................
					public static void selectsaladChoice(int saladChoice)
					{
						switch (saladChoice)
						{
						case 1:
							System.out.print("\nYou have chosen the Lettuce");
							break;
						case 2:
							System.out.print("\nYou have chosen the Tomato");
							break;
						case 3:
							System.out.print("\nYou have chosen Onion");
							break;
						case 4:
							System.out.print("\nYou have chosen the Peppers");
							break;
						case 5:
							System.out.print("\nYou have chosen the Cucumber");
							break;
						case 6:
							System.out.print("\nYou have chosen the Sweetcorn");
							break;
						case 7:
							System.out.print("\nYou have chosen the Cheese");
							break;
						case 8:
							System.out.print("\nYou have chosen the Pickles ");
							break;
						case 9:
							System.out.print("\nYou have chosen the Rice");
							break;
						case 10:
							System.out.print("\nYou have chosen the Egg");
							break;
						case 11:
							System.out.print("\nYou have chosen the Egg");
							break;
						case 12:
							System.out.print("\nYou have chosen Spinach");
							break;
						case 13:
							System.out.print("\nYou have chosen Coleslaw");
							break;	
						default:
							System.out.print("\nInvalid salad option selected!");
						}
					}
					// ................................................
					// ................................................
					// Method to select which sauce you want
					// ................................................
							public static void selectsauceChoice(int sauceChoice)
							{
								switch (sauceChoice)
								{
								case 1:
									System.out.print("\nYou have chosen Mayo as your sauce");
									break;
								case 2:
									System.out.print("\nYou have chosen Taco as your sauce");
									break;
								case 3:
									System.out.print("\nYou have chosen BBQ as your sauce");
									break;
								case 4:
									System.out.print("\nYou have chosen Ketchup as your sauce");
									break;
								case 5:
									System.out.print("\nYou have chosen HP Brownsauce as your sauce");
									break;	
								default:
									System.out.print("\nInvalid option selected!");
								}
							}
					// ................................................
}

	
	

