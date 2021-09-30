package com.bridgelabz.tictactoegame;

public class TicTacToeGame {

	public static void main(String[] args) {
		System.out.println("TicTacToeGame Program");
		TicTacToeGame tictactoegame = new TicTacToeGame();
		tictactoegame.ticTacToeboard();
	}

	private void ticTacToeboard() {
		char[] elements = new char[10];
		for (int i = 1; i < 10; i++) {

			elements[i] = ' ';
			System.out.println(elements[i]);
		}
		System.out.println("Created Empty Board");
	}
}
