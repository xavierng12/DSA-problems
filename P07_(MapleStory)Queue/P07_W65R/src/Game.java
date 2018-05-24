import java.util.ArrayList;

public class Game {
	// array of players playing the game
	ArrayList<String> listOfPlayers;

	// queue of players waiting to play the game
	Queue listInQueue;

	// constructor
	public Game() {
		listOfPlayers = new ArrayList<String>();
		listInQueue = new Queue();
	}

	// login method
	public boolean login(String name) {
		boolean result = false;
		if (listOfPlayers.size() < 5) {
			listOfPlayers.add(name);
			result = true;

		} else {
			if (listInQueue.size() < 10) {
				listInQueue.enqueue(name);
				System.out
						.println("The game server is full. You are in the queue,please wait...");
				result = true;
			} else {
				System.out.println("The queue is full, try again later!");
				result = false;
			}
		}
		return result;
	}

	// logout method
	public boolean logout(String name) {
		for (int i = 0; i < listOfPlayers.size(); i++) {
			if (name.equals(listOfPlayers.get(i))) {
				listOfPlayers.remove(listOfPlayers.get(i));
				if (!listInQueue.isEmpty()) {
					listOfPlayers.add(listInQueue.dequeue().toString());
				}
			}
		}

		return false;
	}

	// display people playing the game and people in queue
	public void display() {
		System.out.println("Players in the game: " + listOfPlayers);
		System.out.println("Players in the queue: ");
		listInQueue.displayQueue();
		System.out.println(" ");
	}
}
