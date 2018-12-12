package pop.entities.roles;

public interface GroupRole extends Role {
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
		
		public Role getParent() {
			return RoleType.GROUPS;
		}
		
		
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
