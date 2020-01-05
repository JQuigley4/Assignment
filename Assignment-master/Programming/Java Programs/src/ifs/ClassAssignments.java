package ifs;

import java.util.Scanner;

public class ClassAssignments 
{

	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		
		String classAssigned = "", studentName = "";
		
		int examScores = 0;
		
		System.out.print("\n\tPlease enter the student's name: ");
		studentName = key.nextLine();
		
		System.out.print("\n\tPlease enter the student's test results: ");
		examScores = key.nextInt();
		
		if(examScores > 60)
		{
			classAssigned = "A";
		}
		else
		{
			classAssigned = "B";
		}
	
		System.out.print("\n\t"+studentName + " has been assigned to class " +classAssigned+ ".");
	
	}

}
