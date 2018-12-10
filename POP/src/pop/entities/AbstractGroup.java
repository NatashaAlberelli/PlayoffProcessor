package pop.entities;


import pop.interfaces.Group;
import pop.roles.Role.RoleTypeGroups;

public abstract class AbstractGroup implements Group {
	private RoleTypeGroups roleType = RoleTypeGroups.TEAM;
	private String name;
	
	public AbstractGroup(String name) {
		this.name = name;
	}

	@Override
	public RoleTypeGroups getRole() {
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
}
