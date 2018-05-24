public class UIofHanoi {
	private static String[] MENU_ITEMS = { "Start New Game", "Move Disc" };

	public static void main(String[] args) {
		Game hanoiGame = new Game();
		int choice = Helper.getUserOption(
				"Tower of Hanoi - Choose your choice ", MENU_ITEMS);
		while (choice != 0) {
			switch (choice) {
			case 1: // start a new game
				for (int i = 0; i < hanoiGame.hanoiTowers.size(); i++) {
					hanoiGame.hanoiTowers.get(i).displayTower();
				}
 

			case 2:// move the disc
				int source = Helper
						.readInt("Choose the tower to move the disc 1,2,3");
				int dest = Helper
						.readInt("Choose the tower to move the disc to 1,2,3");

				if (hanoiGame.moveDisc(source, dest)) {
					// if move succesfully,display towers
					for (int i = 0; i < hanoiGame.hanoiTowers.size(); i++) {
						hanoiGame.hanoiTowers.get(i).displayTower();
					}
				} else {
					System.out.println("choose appropriate towers ");
				}
				break;
			//
			default: // exit
				break;

			}
			choice = Helper.getUserOption(
					"Tower of Hanoi - Choose your choice ", MENU_ITEMS);
		}
	}
}
