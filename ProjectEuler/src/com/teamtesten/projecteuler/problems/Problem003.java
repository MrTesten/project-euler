package com.teamtesten.projecteuler.problems;

import java.math.BigInteger;

import com.teamtesten.projecteuler.utilities.CommonUtilities;

public class Problem003 implements Problem
{
	public String getProblemText()
	{
		return "What is the largest prime factor of the number 600851475143?";
	}

	public int getProblemNumber()
	{
		return 3;
	}

	public BigInteger evaluate()
	{
		long number = 600851475143L;
		long highestPrimeFactor = 0;
		for(long i=3; i*i <= number; i+=2)
			if(CommonUtilities.isFactor(number,i))
				if(CommonUtilities.isPrime(i))
					highestPrimeFactor = i;
		return new BigInteger(Long.toString(highestPrimeFactor));
	}
}
