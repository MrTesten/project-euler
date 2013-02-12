package com.teamtesten.projecteuler.utilities;

import com.teamtesten.projecteuler.problems.*;

public class ProblemFactory
{
	public static Problem createProblem(int problemNumber) throws Exception
	{
		String classPath = "com.teamtesten.projecteuler.problems.";
		String className = String.format("Problem%03d", problemNumber);
		
		Class problemClass = Class.forName(classPath+className);
		Problem problem = (Problem)problemClass.newInstance();
		
		return problem;
	}
}
