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


	public enum RoleTypeIndividual implements Role {
		/** anyone who competes */
		CONTESTANT,
		SPECTATOR,
		
		/** Authority */
		OFFICIALS,
		/** support */
		STAFF,
		
		/** news and entertainment people */
		
		/** non-contestant part of a larger group */
		MEMBER,
		/** doing a job */

		MEDIA,
		/** anyone else involved */
		PARTICIPANT;
	}
		
}
