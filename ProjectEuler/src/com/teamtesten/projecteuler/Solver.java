package com.teamtesten.projecteuler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

import com.teamtesten.projecteuler.utilities.ProblemFactory;
import com.teamtesten.projecteuler.problems.Problem;

public class Solver
{	
	private Problem problem;
	private double evaluationTime;
	private BigInteger result;
	
	public Solver(String problemNum)
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
			System.out.println("Result: " + result.toString());
			System.out.println("Execution Time: " + evaluationTime + "ms.");
		}
	}

	public static void main(String[] args)
	{
		Solver solver = null;

		if(args.length > 0)
		{
			solver = new Solver(args[0]);
		}
		else
		{
			try
			{
				BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

				System.out.print("Which problem would you like to solve? ");
				String input = br.readLine();
				
				solver = new Solver(input);
			}
			catch (IOException e)
			{
				System.out.println("Invalid input (" + e.getMessage() + ").");
			}
		}

		if(solver != null)
		{
			solver.solve();
			solver.printResults();
		}
	}
}
