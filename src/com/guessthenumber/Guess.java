package com.guessthenumber;

public class Guess {
	String name;
	static int attempts=3;
	static int points=0;
	Guess(String name)
	{
		this.name=name;
	}
	void display(int n)
	{
		if(attempts==3)
		{
			System.out.println("Hello Mr."+name+"\n"+"Welcome to the game");
			
			System.out.println("You have "+attempts+" attempts");
		}
		
		if(points>0)
			//System.out.println("Number is " +n);
			System.out.println("You have earned "+points+" points");
		if(attempts==3) {
			System.out.println("Let's Start....");
		}
		
		if(attempts<3 && attempts>0) {
			System.out.println("Random Number is " +n);
			System.out.println("Try again you have "+attempts+" attempts");
		}
		if(attempts==0) {
			//System.out.println("Number is " +n);
			System.out.println("Your score is "+ points);
			System.out.println("Thanks for playing");
		}

	}
	boolean numberMatch(int n1,int n2)
	{
		if(n1==n2)return true;
		return false;
	}
}
