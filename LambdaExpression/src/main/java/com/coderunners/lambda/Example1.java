package com.coderunners.lambda;

import java.util.ArrayList;
import java.util.stream.*;

/**
 * Write a program using Stream terminal operation (matchAll()) 
 * to find if all candidates appearing for the interview are local natives. 
 * Also retrieve the youngest candidate details using (min() method)
 * 
 * @author Vishal Patel
 */
public class Example1 
{
	public static void main(String[] args) 
	{
		ArrayList<Candidate> candidates = new ArrayList<Candidate>();
		candidates.add(new Candidate("Bob Smith",30,true));
		candidates.add(new Candidate("Larry Palmer",25,true));
		candidates.add(new Candidate("Robin Hood",40,false));
		candidates.add(new Candidate("Alice Woods",19,false));
		candidates.add(new Candidate("Cory Mckenzie",50,true));
		
		System.out.println(candidates.stream().allMatch(i -> i.isLocal()));
		
	}
}
