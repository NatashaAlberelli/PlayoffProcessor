package pop.interfaces;

public interface Playable {
	public enum WinLose {
		WINNER,
		LOSER,
		UNDETERMINED;
	}
	
	public WinLose getState();
	public boolean isDefeated();
	public boolean isVictorious();
	public boolean isUndetermined();
	public void toDefeat();
	public void toVictory();
	public void toUndetermined();
}
