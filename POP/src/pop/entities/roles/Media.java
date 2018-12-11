package pop.entities.roles;

import pop.entities.Role;

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
		return Role.RoleTypeIndividual.MEDIA;
	}
}
