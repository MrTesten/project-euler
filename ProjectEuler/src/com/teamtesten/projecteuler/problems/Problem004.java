package com.teamtesten.projecteuler.problems;


public class Problem004 implements Problem
{
	public String getProblemText()
	{
		return "Find the largest palindrome made from the product of two 3-digit numbers.";
	}

	public int getProblemNumber()
	{
		return 4;
	}

	public String evaluate()
	{
		int highestPalindrome = 0;

		for(int i=100; i<1000; i++)
		{
			for(int j=100; j<1000; j++)
			{
				int ij = i*j;
				if(ij > highestPalindrome && isPalindrome(ij))
					highestPalindrome = ij;
			}
		}

		return Integer.toString(highestPalindrome);
	}

	private boolean isPalindrome(final int number)
	{
		boolean result = true;

		String num = Integer.toString(number);
		for(int i = 0; i <= ((num.length()/2)-1); i++)
			if(num.charAt(i) != num.charAt(num.length()-i-1))
				result = false;

		return result;
	}
}
