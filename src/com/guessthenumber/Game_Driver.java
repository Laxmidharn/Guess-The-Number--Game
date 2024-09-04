package com.guessthenumber;

import java.util.Scanner;

public class Game_Driver {
	static int attempt=3;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println("Enter your gender");
		String gender = sc.next();
		
		boolean flag=false;
		if(gender=="male")flag=true;
		else flag = false;
		
		if(flag)System.out.println("Hello Mr."+name+" Welcome to Guess the number");
		else System.out.println("Hello Miss "+name+" Welcome to Guess the number");
		
		
		int n=(int)(Math.random()*9)+1;
		
		while(attempt>0);
		{
			System.out.println("Enter your guessed number");
			int number=sc.nextInt();
			if(number==n)System.out.println("Hoorrayyy... You got it");
			else System.out.println("Try again you have "+attempt+" attempts more");
			attempt--;
		}
	}
}
