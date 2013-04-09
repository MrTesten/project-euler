package com.teamtesten.projecteuler.problems;

import com.teamtesten.projecteuler.utilities.CommonUtilities;

public class Problem010 implements Problem
{
	public String getProblemText()
	{
		return "Find the sum of all the primes below two million.";
	}

	public int getProblemNumber()
	{
		return 10;
	}

	public String evaluate()
	{
		long max = 2000000;

		long current = 0, sum = 0;
		while(current < max)
		{
			if(CommonUtilities.isPrime(current))
				sum+=current;
			current++;
		}
		return Long.toString(sum);
	}

}
