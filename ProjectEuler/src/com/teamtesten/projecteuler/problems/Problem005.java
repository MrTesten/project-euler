package com.teamtesten.projecteuler.problems;

import java.math.BigInteger;

public class Problem005 implements Problem
{
	public String getProblemText()
	{
		return "What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?";
	}
	
	public int getProblemNumber()
	{
		return 5;
	}
	
	public BigInteger evaluate()
	{
		int lowTerm = 1;
		int highTerm = 20;
		int answer = 0;

		int current = highTerm;
		while (answer == 0)
		{
			for (int i = lowTerm; (i <= highTerm) && (current % i == 0); i++)
				if (i == highTerm)
					answer = current;

			current += highTerm;
		}

		return new BigInteger(Integer.toString(answer));
	}
}