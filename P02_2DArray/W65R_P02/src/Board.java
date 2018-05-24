public class Board {
	static int ROWS = 3;
	static int COLS = 3;
	Sym[][] tboard = new Sym[ROWS][COLS];

	// constructor = initializes the board
	public Board() {
		for (int r = 0; r < ROWS; r++) {
			for (int c = 0; c < COLS; c++) {
				tboard[r][c] = Sym.E;
			}
		}
	}

	void displayBoard() {
		for (int r = 0; r < ROWS; r++) {
			for (int c = 0; c < COLS; c++) {
				System.out.print(tboard[r][c]);
			}
			System.out.println();
		}

	}

	public boolean checkWinner(Sym s) {
		// horizontal
		for (int r = 0; r < ROWS; r++) {
			if (tboard[r][0] == s && tboard[r][1] == s && tboard[r][2] == s) {
				return true;
			}
		}
		// vertical
		for (int c = 0; c < COLS; c++) {
			if (tboard[0][c] == s && tboard[1][c] == s && tboard[2][c] == s) {
				return true;
			}
		}
		// diagonal from [0,0]
		int total = 0;
		for (int r = 0; r < ROWS; r++) {
			for (int c = 0; c < COLS; c++) {
				if ((r == c) && (tboard[r][c] == s)) {
					total++;
				} // end of if
			}
		}
		if (total == 3) {
			return true;
		}
		int cnt = 0;
		for (int r = 0; r < ROWS; r++) {
			for (int c = 0; c < COLS; c++) {
				if ((r + c == (ROWS - 1)) && (tboard[r][c] == s)) {
					cnt++;
				}
			}
		}
		if (cnt == 3) {
			return true;
		}

		return false;
	}

	public Sym[][] getTboard() {
		return tboard;
	}

	public void setTboard(Sym[][] tboard) {
		this.tboard = tboard;
	}
}