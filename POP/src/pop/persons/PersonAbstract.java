package pop.persons;

import pop.interfaces.Nameable;
import pop.persons.roles.Role.RoleType;

public abstract class PersonAbstract implements Person, Nameable {	
	
	private String name;
	private RoleType role;
	
	public PersonAbstract(String name) {
		this(name, RoleType.SPECTATOR);
	}
	
	public PersonAbstract(String name, RoleType role) {
		this.name = name;
		this.role = role;
	}
	
	@Override
	public RoleType getRole() {
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
	
	@Override
	public String toString() {
		return Player.class.getName() + ": " + getName();
	}
}
