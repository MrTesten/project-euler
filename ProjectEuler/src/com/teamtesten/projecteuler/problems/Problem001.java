package com.teamtesten.projecteuler.problems;

import java.math.BigInteger;

import com.teamtesten.projecteuler.utilities.CommonUtilities;

public class Problem001 implements Problem
{
	public String getProblemText()
	{
		return "Find the sum of all the multiples of 3 or 5 below 1000.";
	}

	public int getProblemNumber()
	{
		return 1;
	}

	public BigInteger evaluate()
	{
		int maxNumber = 1000;
		int sum = 0;
		for(int i = 3; i < maxNumber; i++)
			if(CommonUtilities.isFactor(i, 3) || CommonUtilities.isFactor(i, 5))
				sum += i;
		return new BigInteger(Integer.toString(sum));
	}
	
	

}
