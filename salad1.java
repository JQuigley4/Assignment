package assignmentTwo;
import java.util.Scanner;
class salad {

	public static void main(String[] args) 
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
