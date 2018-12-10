package pop.roles;

public enum Media implements Role {
	REPORTER,
	PANELIST,
	EXPERT,
	INTERVIEWER,
	CAMERAMAN,
	ALUMNI,
	COMMENTATOR;

	@Override
	public Role getParent() {
		return Role.RoleTypeIndividuals.MEDIA;
	}
}
