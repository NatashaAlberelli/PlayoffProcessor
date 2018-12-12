package pop.entities;

import pop.entities.interfaces.Groupable;
import pop.entities.roles.Role.RoleTypeGroup;

public abstract class GroupEntity extends Entity implements Groupable {

	private RoleTypeGroup role;
	
	public GroupEntity(String name) {
		this(name, RoleTypeGroup.GANG_PACK);
	}

	public GroupEntity(String name, RoleTypeGroup role) {
		super(name);
		this.role = role;
	}
	
	@Override
	public RoleTypeGroup getRole() {
		return role;
	}

}
