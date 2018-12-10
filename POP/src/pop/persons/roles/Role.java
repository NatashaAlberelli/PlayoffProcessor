package pop.persons.roles;

public interface Role {
	public enum RoleType {
		/** anyone who competes */
		CONTESTANT,
		/** non-contestant part of a larger group */
		MEMBER,
		/** doing a job */
		STAFF,
		/** watching, enjoying, viewing */
		SPECTATOR,
		/** anyone else involved */
		PARTICIPANT;
		
		@Override
		public String toString() {
			return RoleType.class.getName() + ": " + this.name();
		}
		
		public String toFormalName() {
			String name = formalName(this.name());
			return RoleType.class.getName() + ": " + name;
		}
	}
	
	public String getRoleName();
	public String toString();
	public String toFormalString();
	
	public static String formalName(String name) {
		name.toLowerCase();
		Character.toUpperCase(name.charAt(0));
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == '_' && i < (name.length() - 1)) {
				Character.toUpperCase(name.charAt(i + 1));
			}
		}
		return name;
	}
}
