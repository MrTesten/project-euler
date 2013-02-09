package com.teamtesten.projecteuler.problems;

import java.math.BigInteger;

public class Problem009 implements Problem
{
	public String getProblemText()
	{
		return "Find the product abc.";
	}
	
	public int getProblemNumber()
	{
		return 9;
	}

	public BigInteger evaluate()
	{
		double a = 0;
		double b = 0;
		double c = 0;
		
		int tripletSum = 1000;
		
		while((a+b+c) != tripletSum)
		{
			b++;
			for(int i = 0; (i < b) && ((a+b+c)!=tripletSum); i++)
			{
				a = i;
				c = Math.sqrt((a*a)+(b*b));
			}
		}
		Integer abc = (int)(a*b*c);
		return new BigInteger(abc.toString());
	}

}
