package pop.entities.roles;

public enum Officials implements Role{
	REFEREE,
	LINEMAN,
	ANNOUNCER,
	JUDGE,
	HOST,
	TIME_KEEPER,
	TOURNAMENT_ORGANIZER,
	BRACKET_MANAGER;

	@Override
	public Role getParent() {
		return pop.entities.RoleTypeIndividual.STAFF;
	}
}
