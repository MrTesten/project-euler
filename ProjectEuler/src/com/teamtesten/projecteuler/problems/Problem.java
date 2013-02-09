package com.teamtesten.projecteuler.problems;

import java.math.BigInteger;

public interface Problem
{
	public String getProblemText();
	public int getProblemNumber();
	public BigInteger evaluate();
}
