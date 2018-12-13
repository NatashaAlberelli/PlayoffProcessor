package pop.entities;

public abstract class PlayableAbstract implements Playable {

	private WinLose state = WinLose.UNDETERMINED;

	public WinLose getState() {
		return state;
	}
	
	@Override
	public boolean isDefeated() {
		if (state == Playable.WinLose.LOSER) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isVictorious() {
		if (isDefeated()) {
			return false;
		}
		return true;
	}
	
	@Override
	public boolean isUndetermined() {
		if (isVictorious() || isDefeated()) {
			return false;
		}
		return true;
	}

	@Override
	public void toDefeat() {
		state = WinLose.LOSER;
	}

	@Override
	public void toVictory() {
		state = WinLose.WINNER;
	}
	
	@Override
	public void toUndetermined() {
		state = WinLose.UNDETERMINED;
	}
}
