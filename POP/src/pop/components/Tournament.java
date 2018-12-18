package pop.components;

import pop.entities.Entity;

public class Tournament {
	Bracket bracket;
	Entity[] players;
	
	public Tournament(Entity[] players) {
		this.players = players;
		bracket = new Bracket(players.length);
	}
	
	public Entity[] getPlayers() {
		return players;
	}
	
	public Bracket getBracket() {
		return bracket;
	}
	
}
