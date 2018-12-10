package pop.persons;

import pop.future.Entrant;
import pop.persons.roles.Role.RoleType;

public class Player extends Entrant implements Person {

	private RoleType roleType = RoleType.CONTESTANT;
	
	public Player(String name) {
		super(name);
	}
	
	@Override
	public String toString() {
		return Player.class.getName() + ": " + super.getName();
	}

	@Override
	public RoleType getRole() {
		return roleType;
	}
}
