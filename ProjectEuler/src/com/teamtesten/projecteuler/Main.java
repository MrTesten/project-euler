package com.teamtesten.projecteuler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(final String[] args)
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
