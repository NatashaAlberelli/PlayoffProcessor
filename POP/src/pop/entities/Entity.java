package pop.entities;

import pop.entities.identities.Identity;
import pop.entities.roles.Role;

public abstract class Entity {
	Identity identity;
	//role toString will be part of the identity builder constructor
	Role role;
	//use bridge pattern for roles
	
	//optional
	Playable play;
	
	public boolean isPlayable() {
		if (play != null) {
			return true;
		}
		return false;
	}
}