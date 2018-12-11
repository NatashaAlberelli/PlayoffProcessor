package pop.entities;

import pop.entities.Role.RoleTypeIndividual;
import pop.entities.interfaces.Individualable;

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
