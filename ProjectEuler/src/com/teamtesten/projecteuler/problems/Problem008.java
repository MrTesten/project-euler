package com.teamtesten.projecteuler.problems;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Problem008 implements Problem
{
	public String getProblemText()
	{
		return "Find the greatest product of five consecutive digits in the 1000-digit number.";
	}

	public int getProblemNumber()
	{
		return 8;
	}

	public String evaluate()
	{
		int numDigits = 5;
		int highest = 0;

		try
		{
			Scanner s = new Scanner(new File("./res/problem8.txt"));

			String digits = new String();

			while(s.hasNext())
			{
				String line = s.nextLine();

				for(int i = 0; i < line.length(); i++)
				{
					char curr = line.charAt(i);

					if(digits.length() < numDigits)
						digits += curr;
					else
					{
						digits = digits.substring(1);
						digits += curr;

						int value = Problem008.multiplyDigits(digits);
						if(value > highest)
						{
							highest = value;
						}
					}
				}
			}
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File not found!");
		}

		return Integer.toString(highest);
	}

	public static int multiplyDigits(final String digits)
	{
		int result = 1;

		for(int i = 0; i < digits.length(); i++)
			result *= Integer.parseInt(digits.substring(i, i+1));

		return result;
	}

}
