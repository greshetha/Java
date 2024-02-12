package GullyGirl;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int rnum = r.nextInt(100) + 1;
		int guess;
		boolean correctGuess = false;
		
		System.out.println(" Guessing game ");
		
		while(!correctGuess) {
			System.out.println("enter number between 1 and 100");
			guess = sc.nextInt();
			
			if(guess < 1  ||  guess > 100) {
				System.out.println("please enter number between 1 and 100");
			}
			
			else if(guess < rnum) {
				System.out.println("its low, try again");
			
			}
			else if(guess > rnum) {
				System.out.println("its high, try again");
			}
			else {
				System.out.println("Great! correct.");
				correctGuess = true;
			}
		}
	}

}
