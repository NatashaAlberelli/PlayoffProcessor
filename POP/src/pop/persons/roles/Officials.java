package pop.persons.roles;

public enum Officials implements Role{
	REFEREE,
	LINEMAN,
	ANNOUNCER,
	JUDGE,
	TOURNAMENT_ORGANIZER,
	BRACKET_MANAGER;
	
	public static final RoleType roleType = RoleType.STAFF;
	
	public static RoleType getRoleType() {
		return roleType;
	}

	@Override
	public String getRoleName() {
		return Role.formalName(this.name());
	}
	
	@Override
	public String toString() {
		return Media.class.getName() + ": " + this.name() ;
	}
	
	@Override
	public String toFormalString() {
		return Media.class.getName() + ": " + Role.formalName(this.name());
	}
}
