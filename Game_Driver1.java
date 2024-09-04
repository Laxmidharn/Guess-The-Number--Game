package com.guessthenumber;
//import com.guessthenumber.Guess;
import java.util.Scanner;

public class Game_Driver1 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name");
		
		String name=sc.nextLine();	
		Guess g= new Guess(name);
		int n;
		g.display(0);
		
		int num;
		
		while(Guess.attempts>0) {
			System.out.println("Enter your guessed number");
			num=sc.nextInt();
			
			n=(int) ((Math.random()*9)+1);
			if(g.numberMatch(num, n)) {
				System.out.println("Hoorryyy... You got it...");
				Guess.points+=10;
			}
			Guess.attempts--;
			g.display(n);
		}	
	}
}
