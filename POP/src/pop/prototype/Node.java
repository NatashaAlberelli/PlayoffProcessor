package pop.prototype;

public class Node {
	public enum Resolution {
		WAITING,
		IN_PROGRESS,
		RESOLVED;
	}
	
	private Player[] players;
	private Resolution state = Resolution.WAITING;
	
	public Node (Player[] players) {
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
			if (x.getState() == Player.WinLose.WINNER){
				return x;
			}
		}
		return null;
	}
	
	public Player getLoser() {
		for (Player x : players) {
			if (x.getState() == Player.WinLose.LOSER){
				return x;
			}
		}
		return null;
	}
}
