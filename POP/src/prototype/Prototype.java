package prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.HashMap;

public class Prototype {

	Scanner input;
	List<String> players = new ArrayList<String>();
	Map<Integer, String> playerList = new HashMap<Integer, String>();

	public void openInput() {
		try {
			input = new Scanner(Paths.get("src/prototype/testList.txt"));
		} catch (IOException e1) {
			System.err.println("Error opening file. TERMINANTING OPEN");
		}
	}

	public void read() {
		try {
			while (input.hasNext()) {
				players.add(input.next());
			}
		} catch (NoSuchElementException e1) {
			System.err.println("Error reading file. TERMINANTING READ");
		} catch (IllegalStateException e2) {
			System.err.println("Error reading file. TERMINANTING READ");
		}
	}

	public void closeInput() {
		if (input != null) {
			input = null;
		}
	}

	public void seed() {
		Collections.shuffle(players);
		for (int i = 0; i < players.size(); i++) {
			playerList.put((i + 1), players.get(i));
		}
	}

	public void removeHalf() {
		List<Integer> remove = elimLosers();
		for (Integer x : remove) {
			playerList.remove(x);
		}
		if (playerList.size() == 1) {
			System.out.println("AND THE WINNER IS:");
			System.out.println("\n" + playerList.get(getWinner()) + "\n");
		}
	}

	public List<Integer> elimLosers() {
		input = new Scanner(System.in);
		List<Integer> removeIndex = new ArrayList<Integer>();

		for (int i = 0; i < (playerList.size() / 2); i++) {
			System.out.println("Please enter bracket " + (i + 1) + " loser number: ");
			removeIndex.add(Integer.parseInt(input.next()));
		}
		return removeIndex;
	}

	public Integer getWinner() {
		for (Integer x : playerList.keySet()) {
			return x;
		}
		return -1;
	}

	public void printList() {
		int i = 0;
		for (Integer x : playerList.keySet()) {
			if (i % 2 == 0) {
				System.out.println("\nBracket: " + ((i / 2) + 1));
			}
			System.out.println(x + ": " + playerList.get(x));
			i++;
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Prototype game = new Prototype();

		String choice;

		System.out.println("Welcome to Playoff Processor!");

		do {
			if (game.playerList.size() == 1) {
				System.out.println("Play again? (Y/N): ");
			} else {
				System.out.println("Menu: ");
				System.out.println("R: read");
				System.out.println("D: display current bracket");
				System.out.println("A: advance bracket to next round");
				System.out.println("Q: quit");
			}

			choice = in.next().toUpperCase().substring(0, 1);

			switch (choice) {
			case "R":
				game.openInput();
				game.read();
				game.closeInput();
				game.seed();
				break;
			case "D":
				game.printList();
				break;
			case "A":
				game.removeHalf();
				break;
			case "Q":
				break;
			case "Y":
				break;
			case "N":
				break;
			default:
				System.out.println("Invalid Commands");
				break;
			}
		} while (!choice.equals("N") && !choice.equals("Q"));

		in.close();
		
		System.out.println("Goodbye");
	}
}
