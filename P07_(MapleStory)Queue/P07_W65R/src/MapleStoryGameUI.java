public class MapleStoryGameUI {
	public static void main(String[] args) {
		String menu[] = { "Login Player", "Logout Player", "Display players in the current server" };
		Game newGame = new Game();
		int choice = 1;

		while (choice != 0) {
			choice = Helper.getUserOption("Maple Story", menu);
			if (choice == 1) { // login player
				String name = Helper.readString("Enter your name to login");
				newGame.login(name);
			}
			if (choice == 2) {
				// logout
				String name = Helper.readString("Enter your name to logout");
			}
			if (choice == 3) {
				newGame.display();
			}
		}
	}
}
