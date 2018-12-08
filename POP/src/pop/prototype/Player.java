package pop.prototype;

public class Player {
	public enum WinLose {
		WINNER,
		LOSER,
		UNDETERMINED;
	}
	
	private String name;
	private WinLose state;
	
	public Player(String name) {
		this.name = name;
		state  = WinLose.UNDETERMINED;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	public WinLose getState() {
		return state;
	}
	
	public void setWinner() {
		state = WinLose.WINNER;
	}
	
	public void setLoser() {
		state = WinLose.LOSER;
	}
	
	public void setUndetermined() {
		state = WinLose.UNDETERMINED;
	}
	
	public void setWinLoseState(WinLose wl) {
		state = wl;
	}
	
}
