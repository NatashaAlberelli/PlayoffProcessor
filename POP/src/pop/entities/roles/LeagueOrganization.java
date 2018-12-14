package pop.entities.roles;

public enum LeagueOrganization {
	PRESIDENT,
	CEO,
	COMMISSIONER;
	
	public enum RoleTypeGroup implements Role {
		TEAM,
		TEAM_ORGANIZATION,
		LEAGUE,
		OVERSIGHT,
		PRESS,
		/** Group of 1 or more */
		PARTY,
		/** No dupes */
		SET,
		/** Any other group */
		GANG_PACK;
	
		
		/*
		Team,
		TeamOrganization,
		League,
		Board,
		Family,
		
		Council,
		Panel,
		InternationalLeague,
		WorldCompetition,
		Press,
		Business,
		*/	
	}
}
