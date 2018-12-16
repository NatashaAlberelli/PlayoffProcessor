package pop.components;

import pop.entities.actions.Competing.WinLose;
import pop.entities.individuals.Player;

public class ProtoNode {
	public enum Resolution {
		WAITING,
		IN_PROGRESS,
		RESOLVED,
		DRAW;
	}
	
	private Player[] players;
	private Resolution state = Resolution.WAITING;
	
	public ProtoNode (Player[] players) {
		this.players = players;
	}
	
	public Resolution getState() {
		return state;
	}
	
	public void setState(Resolution r) {
		state = r;
	}
	
	public Player[] getPlayers() {
		return players;
	}
	
	public Player getWinner() {
		for (Player x : players) {
			if (x.getState() == WinLose.WINNER){
				return x;
			}
		}
		return null;
	}
	
	public Player getLoser() {
		for (Player x : players) {
			if (x.getState() == WinLose.LOSER){
				return x;
			}
		}
		return null;
	}
}
