/*
* Natasha Alberelli
*/
package pop.future;

import pop.interfaces.Nameable;
import pop.interfaces.Playable;

/**
 * A {@code Entrant} represents an individual, team, vehicle, animal, or any
 * other entrant into a tournament of any type.
 *
 * An entrant agrees to act as a participant in tournament, bracket, playoff or
 * any other competitive event.
 *
 * @author Natasha Alberelli
 * @version 1.0
 * @since JDK1.8
 */
public abstract class Entrant implements Nameable, Playable {


	private String name;
	private WinLose state = WinLose.UNDETERMINED;

	public Entrant(String name) {
		this.name = name;
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
