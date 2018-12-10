package pop.persons.roles;

public enum Media implements Role {
	REPORTER,
	PANELIST,
	EXPERT,
	INTERVIEWER,
	CAMERAMAN,
	ALUMNI,
	COMMENTATOR;

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
