package pop.entities.roles;

public interface IndividualRole {
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
}
