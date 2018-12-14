package pop.entities.roles;

public interface Role {	
	public default String toRoleString() {
		return this.getClass().getName();
	}
}
