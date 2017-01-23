import java.util.Random;
import java.util.Scanner;

public class HigherOrLower {


	
	public static void main(String[] args){
	
		Random rand = new Random();
	    int num = rand.nextInt(100) + 1;
	    int numberOfTries = 0;
		System.out.println("Guess a number between 1 and 100!");
		Scanner Scanner = new Scanner(System.in);
		while (true) {
			int userGuess =  Scanner.nextInt();
			numberOfTries++;
			
			if (userGuess == num){
				System.out.println("Correct! The number was " + num);
				System.out.println("You reached the correct number in " +numberOfTries+ " tries!");
			} else if (userGuess-num > 0) { 
				System.out.println("Lower!");
			} else if (userGuess-num < 0) { 
				System.out.println("Higher!");
			}
		}	
	}
}

