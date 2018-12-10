package pop.properties;

import pop.interfaces.Individual;
import pop.interfaces.Nameable;
import pop.roles.Role.RoleTypeIndividuals;

public abstract class IndividualAbstract implements Individual, Nameable {	
	
	private String name;
	private RoleTypeIndividuals role;
	
	public IndividualAbstract(String name) {
		this(name, RoleTypeIndividuals.SPECTATOR);
	}
	
	public IndividualAbstract(String name, RoleTypeIndividuals role) {
		this.name = name;
		this.role = role;
	}
	
	@Override
	public RoleTypeIndividuals getRole() {
		return role;
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
