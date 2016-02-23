package Quiz1;

import java.util.Scanner;

public class QB {
	private static Scanner keyboard;

	public static void main(String[] args) {
		keyboard = new Scanner(System.in);
		System.out.println("Enter the number of touchdowns: ");
		int td = keyboard.nextInt();
		System.out.println("Enter the number of yards: ");
		int yard = keyboard.nextInt();
		System.out.println("Enter the number of interceptions: ");
		int inter = keyboard.nextInt();
		System.out.println("Enter the number of completions: ");
		int comp = keyboard.nextInt();
		System.out.println("Enter the number of attempted passes: ");
		int attempt = keyboard.nextInt();
		// Calculate the Passer Rating
		double a = ((comp/attempt)-.3)*5;
		//System.out.println(a); (to check value)
		double b = ((yard/attempt)-3)*.25;
		//System.out.println(b);
		double c = ((td/attempt)*20);
		//System.out.println(c);
		double d = (2.375-((inter/attempt)*25));
		//System.out.println(d);
		double pRate = (((a+b+c+d)/6)*100);
		System.out.println(pRate);
		
		
		
	}
	
}
