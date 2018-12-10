package pop.interfaces;

import pop.roles.Role.RoleTypeGroups;

public interface Group extends Nameable {
	public RoleTypeGroups getRole();
}
