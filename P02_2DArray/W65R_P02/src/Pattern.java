public class Pattern {

	public static void main(String args[]) {
		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < 5; col++) {
				System.out.print("% ");
			}
			System.out.println();
		}

		System.out.println("Pattern B");
		{
			for (int row = 0; row < 5; row++) {
				for (int col = 0; col < 5; col++) {
					if (row == 0 || row == 4 || col == 0 || col == 4) {
						System.out.print("%");
					} else {
						System.out.print("  ");
					}
				}
				System.out.println();
				{
				}

				System.out.println("Pattern C");
		{
			for (int rowc = 5; rowc > 0; rowc--){
				for (int colc = 0; colc < 5; colc--) {
					System.out.print("% ");
						}
					System.out.println(); 
				}

			}
		}
		}
	}
}


/*
 * int j; for ( j = 5; j > 0; j-- ) 
 * { System.out.print( j + " " ); }
 * System.out.println( );
 */

