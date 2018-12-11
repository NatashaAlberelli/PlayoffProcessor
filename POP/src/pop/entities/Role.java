package pop.entities;

public interface Role {
	public enum RoleType implements Role{
		PERSONS,
		GROUPS;
		
		public Role getParent() {
			return this;
		}
	}
	
	public enum RoleTypeIndividual implements Role {
		/** anyone who competes */
		CONTESTANT,
		/** watching, enjoying, viewing */
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
		
		public Role getParent() {
			return RoleType.PERSONS;
		}
	}
	
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
	
	public Role getParent();
}
