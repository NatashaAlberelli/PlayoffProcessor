package pop.entrants;

import pop.interfaces.IndividualEntrant;
import pop.interfaces.Playable;
import pop.roles.Role.RoleTypeIndividuals;

public abstract class AbstractIndividualEntrant implements IndividualEntrant{
	private RoleTypeIndividuals roleType = RoleTypeIndividuals.CONTESTANT;
	private WinLose state = WinLose.UNDETERMINED;
	private String name;
	
	public AbstractIndividualEntrant(String name) {
		this.name = name;
	}

	@Override
	public RoleTypeIndividuals getRole() {
		return roleType;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

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
