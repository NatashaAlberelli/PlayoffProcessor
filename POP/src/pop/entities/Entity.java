package pop.entities;

import pop.entities.identities.Identity;
import pop.entities.states.StateControl;

public abstract class Entity {
	private Identity identity;
	private StateControl actions;
	
	public Entity(Identity id, StateControl actions) {
		this.identity = id;
		this.actions = actions;
	}

	
	
	public void setIdentity(Identity id) {
		this.identity = id;
	}
	
	public Identity getIdentity() {
		return identity;
	}
	
	public StateControl getActions() {
		return actions;
	}
}