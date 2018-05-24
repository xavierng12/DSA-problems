import java.util.Stack;
import java.util.ArrayList;

public class Game {
	String DISC1 = "   *|*";
	String DISC2 = "  **|**";
	String DISC3 = " ***|***";
	String DISC4 = "****|****";
	public Stack<String> pileOfDisc = new Stack<String>();
	public ArrayList<Tower> hanoiTowers = new ArrayList<Tower>();

	public Game() {
		// all the towers must be initalised
		hanoiTowers.add(new Tower("Tower 1", 4));
		hanoiTowers.add(new Tower("Tower 2", 0));
		hanoiTowers.add(new Tower("Tower 3", 0));

		pileOfDisc.push(DISC4);
		pileOfDisc.push(DISC3);
		pileOfDisc.push(DISC2);
		pileOfDisc.push(DISC1);

		// push the pile of disc into the tower

		for (String disc : pileOfDisc) {
			// move disc method in the tower
			hanoiTowers.get(0).pushDiscToTower(disc);
		}

	}

	public boolean moveDisc(int source, int dest) {
		String disc = hanoiTowers.get(source - 1).peekTower();

		if (disc == null) {
			return false;
		}
		if (hanoiTowers.get(dest - 1).pushDiscToTower(disc)) {
			hanoiTowers.get(source - 1).popdisc();
			return true;
		}
		return false;

	}
}