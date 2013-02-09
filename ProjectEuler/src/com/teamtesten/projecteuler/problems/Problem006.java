package com.teamtesten.projecteuler.problems;

import java.math.BigInteger;

public class Problem006 implements Problem
{
	public String getProblemText()
	{
		return "Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.";
	}
	
	public int getProblemNumber()
	{
		return 6;
	}

	public BigInteger evaluate()
	{
		int startTerm = 1;
		int stopTerm = 100;

		int sumOfSquares = 0, squareOfSums = 0;
		for (int i = startTerm; i <= stopTerm; i++)
		{
			sumOfSquares += (i * i);
			squareOfSums += i;
		}
		squareOfSums *= squareOfSums;

		Integer difference = squareOfSums - sumOfSquares;
		return new BigInteger(difference.toString());
	}
}
