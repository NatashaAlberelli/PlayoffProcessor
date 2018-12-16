package pop.entities;

import pop.entities.Actions.Actions;
import pop.entities.identities.Identity;

public abstract class Entity {
	private Identity identity;
	private Actions actions;
	
	public Entity(Identity id, Actions actions) {
		this.identity = id;
		this.actions = actions;
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
}