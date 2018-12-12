package pop.entities;

import pop.entities.interfaces.Groupable;
import pop.entities.roles.Role.RoleTypeGroup;

public abstract class GroupEntrant extends Entrant implements Groupable {
	private RoleTypeGroup role;
	
	public GroupEntrant(String name) {
		this(name, RoleTypeGroup.GANG_PACK);
	}

	public GroupEntrant(String name, RoleTypeGroup role) {
		super(name);
		this.role = role;
	}
	
	@Override
	public RoleTypeGroup getRole() {
		return role;
	}

}
