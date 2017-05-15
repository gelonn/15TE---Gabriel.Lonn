import java.util.Scanner;
public class TicTacToeGame {

	public static void main(String[] args) {
		
			TicTacToe game = new TicTacToe();
			
			while(game.checkForWin() == false && game.isBoardFull() == false){
	
			Scanner in = new Scanner(System.in);
			
			System.out.println("Place my mark in row number: ");
			int row = in.nextInt() - 1;
			
			System.out.println("Column number: ");
			int col = in.nextInt() - 1;
			
			game.placeMark(row,col);
			
			game.printBoard();
			
			game.changePlayer();
		
		}
		
		if (game.checkForWin()) {
		   System.out.println("We have a winner! Congrats!");
		   System.exit(0);
		}
		else if (game.isBoardFull()) {
		   System.out.println("Appears we have a draw!");
		   System.exit(0);
		}

	}

}
