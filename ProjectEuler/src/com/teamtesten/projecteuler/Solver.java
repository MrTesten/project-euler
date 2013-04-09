package com.teamtesten.projecteuler;

import com.teamtesten.projecteuler.problems.Problem;
import com.teamtesten.projecteuler.utilities.ProblemFactory;

public class Solver
{
	private Problem problem;
	private double evaluationTime;
	private String result;

	public Solver(final String problemNum)
	{
		try
		{
			int problemNumber = Integer.parseInt(problemNum);
			problem = ProblemFactory.createProblem(problemNumber);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Invalid argument, enter the number of the problem to run.");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Problem " + problemNum + " has not yet been completed.");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

	public void solve()
	{
		if(problem != null)
		{
			long startTime = System.nanoTime();
			result = problem.evaluate();
			evaluationTime = (System.nanoTime() - startTime)/1000000.0;
		}
	}

	public void printResults()
	{
		if(problem != null)
		{
			System.out.println("Problem " + problem.getProblemNumber() + ": " + problem.getProblemText());
			System.out.println("Result: " + result);
			System.out.println("Execution Time: " + evaluationTime + "ms.");
		}
	}
}
