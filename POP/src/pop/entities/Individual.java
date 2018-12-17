package pop.entities;

import pop.entities.identities.Identity;
import pop.entities.states.StateControl;

public abstract class Individual extends Entity{
	
	public Individual(Identity id, StateControl actions) {
		super(id, actions);
	}
}
