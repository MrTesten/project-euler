package com.teamtesten.projecteuler.utilities;

import com.teamtesten.projecteuler.problems.*;

public class ProblemFactory
{
	public static Problem createProblem(int problemNumber) throws Exception
	{
		String className = String.format("%s.Problem%03d",
				Problem.class.getPackage().getName(), problemNumber);
		Problem problem = (Problem)Class.forName(className).newInstance();
		
		return problem;
	}
}
