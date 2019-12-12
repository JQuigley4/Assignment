package fors;

public class TimesTables 
{
	public static void main(String[] args) 
	{
		for (int r=1; r<=10;r++)
		{
			for (int c=1; c<=10; c++)
			{
				System.out.print((r*c) + "\t");
			}
			System.out.print("\n");
		}
	}
}
