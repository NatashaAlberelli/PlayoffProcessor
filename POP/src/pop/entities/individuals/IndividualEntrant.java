package pop.entities.individuals;

import pop.entities.interfaces.Individualable;
import pop.entities.roles.Role.RoleTypeIndividual;

public abstract class IndividualEntrant extends Entrant implements Individualable {

	private RoleTypeIndividual role;
	
	public IndividualEntrant(String name) {
		super(name);
		this.role = RoleTypeIndividual.CONTESTANT;
	}
	
	@Override
	public RoleTypeIndividual getRole() {
		return role;
	}
}
