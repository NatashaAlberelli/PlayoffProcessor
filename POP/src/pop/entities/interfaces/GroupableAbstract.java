package pop.entities.interfaces;

import pop.entities.Role.RoleTypeGroup;

public abstract class GroupableAbstract implements Groupable {
	private RoleTypeGroup role = RoleTypeGroup.GANG_PACK;
	
	public GroupableAbstract() {
	}
	
	public GroupableAbstract(RoleTypeGroup role) {
		this.role = role;
	}
	
	@Override
	public RoleTypeGroup getRole() {
		return role;
	}
}
