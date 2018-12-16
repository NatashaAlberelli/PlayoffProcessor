package pop.entities;

import pop.entities.Actions.Actions;
import pop.entities.identities.Identity;

public abstract class Individual extends Entity{
	
	public Individual(Identity id, Actions actions) {
		super(id, actions);
	}
}
