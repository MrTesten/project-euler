package com.teamtesten.projecteuler.problems;

import java.math.BigInteger;

import com.teamtesten.projecteuler.utilities.CommonUtilities;

public class Problem007 implements Problem
{
	public String getProblemText()
	{
		return "What is the 10 001st prime number?";
	}
	
	public int getProblemNumber()
	{
		return 7;
	}

	public BigInteger evaluate()
	{
		int findPrime = 10001;
		
		int numPrimes = 0, current = 1;
		while(numPrimes < findPrime)
		{
			current++;
			if(CommonUtilities.isPrime(current))
				numPrimes++;
		}
		return new BigInteger(Integer.toString(current));
	}

}
