package pop.entities.interfaces;

import pop.entities.roles.Role.RoleTypeIndividual;

public abstract class IndividualableAbstract implements Individualable {	
	
	private RoleTypeIndividual individualRole = RoleTypeIndividual.SPECTATOR;
	
	public IndividualableAbstract() {
	}
	
	public IndividualableAbstract(RoleTypeIndividual individualRole) {
		this.individualRole = individualRole;
	}
	
	@Override
	public RoleTypeIndividual getRole() {
		return individualRole;
	}
}
