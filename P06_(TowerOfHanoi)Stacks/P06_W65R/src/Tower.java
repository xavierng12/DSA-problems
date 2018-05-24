import java.util.Stack;

public class Tower {
	String towerName;
	public Stack<String> discInTower = new Stack<String>();
	int towerSize;
	int POLE_SIZE = 5;

	// constructor
	public Tower(String name, int size) {
		towerName = name;
		towerSize = size;
	}

	public String getTowerName() {
		return towerName;
	}

	public void setTowerName(String towerName) {
		this.towerName = towerName;
	}

	public int getTowerSize() {
		return discInTower.size();
	}

	public void setTowerSize(int towerSize) {
		this.towerSize = towerSize;
	}

	// display tower
	public void displayTower() {
		// print the pole
		for (int i = 0; i < POLE_SIZE - discInTower.size(); i++) {
			System.out.println("    |   ");
		}
		for (int i = discInTower.size() - 1; i >= 0; i--) {
			System.out.println(discInTower.get(i));
		}
		// print base of the tower

		System.out.println("==========\n");
	}

	// move/push disc into the tower
	public boolean pushDiscToTower(String disc) {
		if (discInTower.isEmpty()) {
			discInTower.push(disc);
			towerSize++;
			return true;
		}
		// the disc inside the tower must be bigger than the disc being pushed
		if (discInTower.peek().length() > disc.length()) {
			discInTower.push(disc);
			towerSize++;
			return true;
		}
		return false;
	}

	// pop/remove
	public String popdisc() {
		if (!discInTower.empty()) {
			towerSize--;
		}
		return discInTower.pop();
	}

	// peek the disc on the tower
	public String peekTower() {
		return discInTower.peek();
	}
}
