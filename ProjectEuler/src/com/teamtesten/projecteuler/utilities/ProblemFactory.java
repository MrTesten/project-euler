package com.teamtesten.projecteuler.utilities;

import com.teamtesten.projecteuler.problems.*;

public class ProblemFactory
{
	public static Problem createProblem(int problemNumber) throws Exception
	{
		Problem problem = null;
		switch(problemNumber)
		{
			case   1: problem = new Problem001(); break;
			case   2: problem = new Problem002(); break;
			case   3: problem = new Problem003(); break;
			case   4: problem = new Problem004(); break;
			case   5: problem = new Problem005(); break;
			case   6: problem = new Problem006(); break;
			case   7: problem = new Problem007(); break;
			case   8: problem = new Problem008(); break;
			case   9: problem = new Problem009(); break;
			case  10: problem = new Problem010(); break;
			default:
				throw new Exception("Invalid problem number.");
		}
		
		return problem;
	}
}
