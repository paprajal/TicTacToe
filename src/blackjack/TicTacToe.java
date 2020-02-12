/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;
import java.util.Scanner;
/**
 *
 * @author patel
 */
public class TicTacToe {

    int[][] board = new int[3][3];

	
	public void start() {
		System.out.println("Welcome to TicTacToe!");
		//Display the initial board
		displayBoard();
		// Ask the user to set the board
		initializeBoard();
		//Display  the board afterward
		displayBoard();
		
		checkRowForWinner(0);
		checkRowForWinner(1);
		checkRowForWinner(2);
		
		
		checkColumnForWinner(0);
		checkColumnForWinner(1);
		checkColumnForWinner(2);
		
		checkDiagonal1ForWinner();
		checkDiagonal2ForWinner();
		
	}
	
	public void displayBoard() {
		System.out.println("The board is: ");
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print("\t|" + board[i][j] + "|");
				
			}
			System.out.println();
		}
	}
	
	public void initializeBoard() {
		
		int currentPlayer = 1;
		while(true) {
			
			System.out.println("Please enter the row and column");
			Scanner scanner = new Scanner(System.in);
			int i = scanner.nextInt();
			int j = scanner.nextInt();
			
			
			if(board[i][j] != 0) {
				System.out.println("Not empty, TRY AGAIN");
				continue;
				
			}
		
		
				board[i][j] = currentPlayer;
				displayBoard();
				
				
				checkRowForWinner(0);
				checkRowForWinner(1);
				checkRowForWinner(2);
				
				
				checkColumnForWinner(0);
				checkColumnForWinner(1);
				checkColumnForWinner(2);
				
				checkDiagonal1ForWinner();
				checkDiagonal2ForWinner();
				
				
				checkBoard();
				currentPlayer = -currentPlayer;
				//displayBoard();
				
				
				
				
				
				
				
				
		}
				
	}
			
		
		
	
	
	public void checkRowForWinner(int rowNumber) {
		int sum = board[rowNumber][0] + board[rowNumber][1] + board[rowNumber][2];
		if (sum == 3) {
			System.out.println("x won");
			System.exit(0);
		}
		else if(sum == -3) {
			System.out.println("o won");
			System.exit(0);
		}
		// do nothing if not +3 or -3
		
	}
	
	public void  checkColumnForWinner(int colNumber) {
		int sum = board[0][colNumber] + board[1][colNumber] + board[2][colNumber];
		if (sum == 3) {
			System.out.println("x won");
			System.exit(0);
		}
		else if(sum == -3) {
			System.out.println("o won");
			System.exit(0);
		}
		// do nothing if not +3 or -3
	}
	
	
	public void checkDiagonal1ForWinner() {
		int sum = board[0][0] + board[1][1] + board[2][2];
		if (sum == 3) {
			System.out.println("x won");
			System.exit(0);
		}
		else if(sum == -3) {
			System.out.println("o won");
			System.exit(0);
		}
	}
	
	public void checkDiagonal2ForWinner() {
		int sum = board[0][2] + board[1][1] + board[2][0];
		if (sum == 3) {
			System.out.println("x won");
			System.exit(0);
		}
		else if(sum == -3) {
			System.out.println("o won");
			System.exit(0);
		}
	}
	
	public void checkBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(board[i][j] == 0) {
					return;
				
				}
				
			}
			
		}
		
		System.out.println("Draw");
		System.exit(0);
	}
	

    
    
}
