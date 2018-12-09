package pop.prototype;

import java.util.Arrays;
import java.util.Collections;

public class Tournament {
	private Bracket bracket;
	private Player[] players;
	
	public Tournament(Player[] players) {
		this.players = players;
		bracket = new Bracket(players.length);
		setRound();
	}
	
	public Player[] getPlayers() {
		return players;
	}
	
	public Bracket getBracket() {
		return bracket;
	}
	
	private void setRound() {
		Collections.shuffle(Arrays.asList(players));
		
		Player[][] pairs = new Player[bracket.getTree()[0].length][];
		
		for (int i = 0; i < pairs.length; i++) {
			pairs[i] = new Player[2];
		}
		
		Player[] roundList = new Player[bracket.getTree()[0].length * 2];
		
		System.arraycopy(players, 0, roundList, 0, roundList.length);
		
		for (int i = 0; i < roundList.length; i++) {
			pairs[i / 2][i % 2] = roundList[i];
			pairs[i / 2][i % 2] = roundList[i];
			
			bracket.getTree()[0][i / 2] = new Node(pairs[i / 2]);
		}
	}
}
