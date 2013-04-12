package com.teamtesten.projecteuler.utilities;

public final class CommonUtilities
{
	private CommonUtilities()
	{

	}

	public static boolean isPrime(final long n)
	{
		if(n==2)
			return true;

	    if(n<2 || n%2==0)
	    	return false;

	    for(long i=3;i*i<=n;i+=2)
	    {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}

	public static boolean isFactor(final long number, final long divisor)
	{
		return(number%divisor == 0);
	}
}
