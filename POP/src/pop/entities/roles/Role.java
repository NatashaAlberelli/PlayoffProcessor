package pop.entities.roles;

public abstract class Role {	
	public String toRoleString() {
		return this.getClass().getName();
	}
}
