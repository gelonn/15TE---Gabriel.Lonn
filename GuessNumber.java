import java.util.Random;
import java.util.Scanner;

public class GuessNumber {


	
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
			} else if (userGuess-num < 10 && userGuess-num > -10) { 
				System.out.println("You are very close!");
			} else if (userGuess-num < 20 && userGuess-num > -20) { 
				System.out.println("You are close!");
			} else if (userGuess-num < 30 && userGuess-num > -30) { 
				System.out.println("You are not close!");
			} else if (userGuess-num < 40 && userGuess-num > -40) { 
				System.out.println("You are not very close!");
			} else {
				System.out.println("You are way off!");
			}
		}	
	}
}
