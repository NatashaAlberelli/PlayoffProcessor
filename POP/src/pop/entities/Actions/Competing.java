package pop.entities.Actions;

public class Competing extends Actions {
	public enum WinLose {
		WINNER,
		LOSER,
		UNDETERMINED;
	}
	
	private WinLose state = WinLose.UNDETERMINED;

	public WinLose getState() {
		return state;
	}
	
	public boolean isDefeated() {
		if (state == Competing.WinLose.LOSER) {
			return true;
		}
		return false;
	}

	public boolean isVictorious() {
		if (isDefeated()) {
			return false;
		}
		return true;
	}
	
	public boolean isUndetermined() {
		if (isVictorious() || isDefeated()) {
			return false;
		}
		return true;
	}

	public void toDefeat() {
		state = WinLose.LOSER;
	}

	public void toVictory() {
		state = WinLose.WINNER;
	}
	
	public void toUndetermined() {
		state = WinLose.UNDETERMINED;
	}
}
