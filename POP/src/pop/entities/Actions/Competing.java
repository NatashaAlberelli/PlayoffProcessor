package pop.entities.Actions;

public class Competing extends Actions {
	
	public enum CompetingActions implements ActionEnum{
		LOSE,
		WIN,
		DRAW,
		IS_WIN,
		IS_LOSE,
		IS_DRAW;
	}

	public Competing() {
		super(WinLose.values());
	}
	
	private WinLose state = WinLose.UNDETERMINED;

	public void actionProcess(ActionEnum action) {
		switch((CompetingActions) action) {
		case LOSE:
			toDefeat();
			break;
		case WIN:
			toVictory();
			break;
		case DRAW:
			toUndetermined();
			break;
		default:
			break;
		}
	}
	
	public boolean validation(ActionEnum check) {
		switch((CompetingActions) check) {
		case IS_WIN:
			return isVictorious();
		case IS_LOSE:
			return isDefeated();
		case IS_DRAW:
			return isUndetermined();
		default:
			return false;
		}
	}
	
	
	public WinLose getState() {
		return state;
	}
	
	private boolean isDefeated() {
		if (state == WinLose.LOSER) {
			return true;
		}
		return false;
	}

	private boolean isVictorious() {
		if (isDefeated()) {
			return false;
		}
		return true;
	}
	
	private boolean isUndetermined() {
		if (isVictorious() || isDefeated()) {
			return false;
		}
		return true;
	}

	private void toDefeat() {
		state = WinLose.LOSER;
	}

	private void toVictory() {
		state = WinLose.WINNER;
	}
	
	private void toUndetermined() {
		state = WinLose.UNDETERMINED;
	}
}
