package pop.entities;

import java.util.List;

import pop.entities.Actions.Actions;
import pop.entities.identities.Identity;
import pop.entities.roles.GroupRole;

public abstract class Group extends Entity {
	
	public Group(Identity id, Actions actions, GroupRole role) {
		super(id, actions, role);
	}
	
	public GroupRole getGroupRole() {
		return (GroupRole) super.getRole();
	}
	
	//suspect
	List<? extends Entity> entities;
	
	abstract boolean add(Entity entity);
	abstract Entity get(Entity entity);	
	abstract boolean remove(Entity entity);
	abstract Entity replace(Entity entity);
	abstract Entity[] getEntities();
}
