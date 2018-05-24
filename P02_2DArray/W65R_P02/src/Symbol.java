
public class Symbol {
	public enum Sym{
		X,O,E
	}
	public static void main(String args[]){
		//declaring the board//
		Sym [][] board = new Sym[3][3];
		for (int i = 0;i<3;i++){
			for(int j = 0;j<3;j++){
				board[i][j] = Sym.E;
				if (i==0){
					board[i][j] = Sym.X;
					//System.out.print(Sym.X);
				} else{
					board[i][j] = Sym.E;
				//System.out.print(Sym.E);
				}
			//System.out.println();
		}
	}
	

		for(int i = 0;i<3;i++){
			for(int j = 0;j<3;j++){
				System.out.print(board[i][j]);
		}
				System.out.println();
	}
		
	if(board[0][0]== Sym.X &&
		board[0][1] == Sym.X &&
		board[0][2] == Sym.X){
		System.out.println("Symbol X is the winner");
}
}
}