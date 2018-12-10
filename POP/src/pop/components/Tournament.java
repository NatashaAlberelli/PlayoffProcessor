package pop.components;

import pop.persons.Player;

public class Tournament {
	Bracket bracket;
	Player[] players;
	
	public Tournament(Player[] players) {
		this.players = players;
		bracket = new Bracket(players.length);
	}
	
	public Player[] getPlayers() {
		return players;
	}
	
	public Bracket getBracket() {
		return bracket;
	}
	
}
