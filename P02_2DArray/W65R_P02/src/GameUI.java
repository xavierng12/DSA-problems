public class GameUI {
	public static void main(String[] args) {
		Board tttBoard = new Board();
		boolean isPlaying = true;
		/* • The program must be able to display the 3×3 grid */
		tttBoard.displayBoard();

		// Choose the currentPlayer
		String player1 = Helper.readString("Enter the name of player 1");
		String player2 = Helper.readString("Enter the name of player 2");

		Sym player1Symbol = Sym.X;
		Sym player2Symbol = Sym.O;

		Sym currentPlayer = player1Symbol;

		while (isPlaying) {

			/*
			 * • The program must be able to provide the option for each player
			 * to choose the row and column of the space that he intend to mark.
			 */
			int rowChoice = Helper.readInt("Choose the row");
			int colChoice = Helper.readInt("Choose the column");

			// set the board to the current player symbol
			tttBoard.getTboard()[rowChoice][colChoice] = currentPlayer;
			tttBoard.displayBoard();

			
			// check if current player is the winner
			// if winner found isPlaying = false
			if (tttBoard.checkWinner(currentPlayer)) {
				isPlaying = false;
				System.out.println("The winner is " + currentPlayer);

			}
			
			/* • The players must take turns to choose the option. */
			if (currentPlayer == player1Symbol) {
		/*		System.out.println( "it's" + currentPlayer + "'s turn");*/
				currentPlayer = player2Symbol;
			} else {
				currentPlayer = player1Symbol;
			}
		}//end of while
	}
}

/*
 * • The program must be able to identify if any of the horizontal, vertical or
 * diagonal rows are marked completely.
 */
/*
 * • Once the program determines the row filled, the program must be able to
 * guess the winner of the game.
 */