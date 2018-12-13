package pop.entities.individuals;

import pop.entities.Entity;
import pop.entities.interfaces.Individualable;
import pop.entities.roles.Role.RoleTypeIndividual;

public abstract class IndividualEntity extends Entity implements Individualable {
	private RoleTypeIndividual role;
	
	public IndividualEntity(String name) {
		this(name, RoleTypeIndividual.SPECTATOR);
	}
	
	public IndividualEntity(String name, RoleTypeIndividual role) {
		super(name);
		this.role = role;
	}
	
	@Override
	public RoleTypeIndividual getRole() {
		return role;
	}
}
