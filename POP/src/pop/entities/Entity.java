package pop.entities;

import pop.entities.Actions.Actions;
import pop.entities.identities.Identity;
import pop.entities.roles.Role;

public abstract class Entity {
	private Identity identity;
	private Actions actions;
	private Role role;
	//role toString will be part of the identity builder constructor
	//use bridge pattern for roles
	
	
	public Entity(Identity id, Actions actions, Role role) {
		this.identity = id;
		this.actions = actions;
		this.role = role;
	}

	
	
	public void setIdentity(Identity id) {
		this.identity = id;
	}
	
	public Identity getIdentity() {
		return identity;
	}
	
	public Actions getActions() {
		return actions;
	}
	
	public Role getRole() {
		return role;
	}
}