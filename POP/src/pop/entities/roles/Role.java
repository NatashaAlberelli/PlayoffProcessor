package pop.entities.roles;

public interface Role {
	public enum RoleType implements Role{
		PERSONS,
		GROUPS;
		
		public Role getParent() {
			return this;
		}
	}	
	public Role getParent();

	//ADD STRING FIELD AND TO STRING METHOD FOR IDENTITY CLASS
}
