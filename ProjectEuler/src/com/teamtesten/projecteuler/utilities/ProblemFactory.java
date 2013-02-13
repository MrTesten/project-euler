package com.teamtesten.projecteuler.utilities;

import com.teamtesten.projecteuler.problems.*;

public class ProblemFactory
{
	public static Problem createProblem(int problemNumber) throws Exception
	{
		String className = "com.teamtesten.projecteuler.problems.Problem";
		className = String.format("%s%03d", className, problemNumber);
		
		Problem problem = (Problem)Class.forName(className).newInstance();
		
		return problem;
	}
}
