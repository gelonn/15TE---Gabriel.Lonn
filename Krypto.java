import java.util.InputMismatchException;
import java.util.Scanner;

public class Krypto {

	static int sizeX, sizeY;
	static char key[] = new char[28];
	
	public static void main(String[] args) {
		for(int i=0; i<28; i++){
			key[i]= ' ';
		}
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("What size do you want your crossword to be?");
		
		System.out.print("Number of rows: ");	
		sizeY = in.nextInt();
		
		System.out.print("Number of columns: ");
		sizeX = in.nextInt();
			
		int[][] crossword = new int[sizeX][sizeY];
		
		System.out.println("Enter the numbers you want to write into your crossword");
		for(int y=0; y < sizeY; y++){
			for(int x=0; x < sizeX; x++){
				System.out.print("Enter number for row "+y+", "+"position "+x+": ");
				crossword[x][y] = in.nextInt();
			}
		}
		while(true){
			for(int i=0; i<28; i++){
				if(key[i] != ' '){
					System.out.println(Integer.toString(i) + " = "+key[i]);
				}
			}
			
			System.out.println("Your crossword looks like this: ");
			for(int y=0; y < sizeY; y++){
				for(int x=0; x < sizeX; x++){
					if(key[crossword[x][y]] != ' '){
						System.out.print(key[crossword[x][y]]+" ");
					} 
					else{
						System.out.print(crossword[x][y]+ " ");
					}
		
				}
				System.out.println();
			}
			
			System.out.println("Enter a number and the letter you would like to exchange it for: ");
			int exchange = in.nextInt();
			String exchangeFor = in.nextLine();
			if(exchange < 28){
				key[exchange] = exchangeFor.charAt(1);
			} else{
				System.out.println("That number is too big!");
			} 
		}
	}
}