package pop.entities;

import pop.interfaces.Individual;
import pop.roles.Role.RoleTypeIndividuals;

public abstract class AbstractIndividual implements Individual{
	private RoleTypeIndividuals roleType = RoleTypeIndividuals.CONTESTANT;
	private String name;
	
	public AbstractIndividual(String name) {
		this.name = name;
	}

	@Override
	public RoleTypeIndividuals getRole() {
		return roleType;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}
}
