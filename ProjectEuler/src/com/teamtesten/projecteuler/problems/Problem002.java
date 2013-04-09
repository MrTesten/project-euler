package com.teamtesten.projecteuler.problems;

import com.teamtesten.projecteuler.utilities.CommonUtilities;

public class Problem002 implements Problem
{
	public String getProblemText()
	{
		return "By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.";
	}

	public int getProblemNumber()
	{
		return 2;
	}

	public String evaluate()
	{
		long maxNumber = 4000000;
		long previous = 1;
		long current = 2;
		long sum = 0;

		while(current < maxNumber)
		{
			if(CommonUtilities.isFactor(current, 2))
				sum += current;
			current = current + previous;
			previous = current - previous;
		}
		return Long.toString(sum);
	}
}
