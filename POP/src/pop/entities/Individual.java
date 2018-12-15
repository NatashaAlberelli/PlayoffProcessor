package pop.entities;

import pop.entities.Actions.Actions;
import pop.entities.identities.Identity;
import pop.entities.roles.IndividualRole;

public abstract class Individual extends Entity{
	
	public Individual(Identity id, Actions actions, IndividualRole role) {
		super(id, actions, role);
	}
	
	public IndividualRole getIndivudalRole() {
		return (IndividualRole) super.getRole();
	}
}
