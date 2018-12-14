package pop.entities;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;

import pop.entities.roles.Role;

public class Identity {
	public enum Identifier {
		// this is a priority order, to benefit from the default declaration ordering of
		// Enum comparable method with use as a key in a TreeMap
		KEY("Key"),
		NAME("Name"),
		NUMBER("Number"),
		ROLE("Role"),
		ALIAS("Alias"),
		TITLE("Title"),
		TAG("Tag"),
		LABEL("Label");

		private String type;

		private Identifier(String type) {
			this.type = type;
		}

		public String getType() {
			return type;
		}

		public String toString() {
			return type + ": ";
		}
	}

	// required
	private String key;
	private Map<String, Identifier> identifiers;
	private Map<Identifier, Boolean> validIdentifiers;

	// optional
	private String name;
	private String number;
	private String role;
	private String[] aliases;
	private String[] titles;
	private String[] tags;
	private String[] labels;

	private Identity(Builder builder) {
		this.key = builder.key;
		this.identifiers = builder.identifiers;
		this.validIdentifiers = builder.validIdentifiers;

		this.name = builder.name;
		this.number = builder.number;
		this.role = builder.role;
		this.aliases = builder.aliases;
		this.titles = builder.titles;
		this.tags = builder.tags;
		this.labels = builder.labels;
	}

	public String key() {
		return key;
	}

	public String name() {
		if (isValidIdentifier(Identifier.NAME)) {
			return name;
		}
		return null;
	}

	public String number() {
		if (isValidIdentifier(Identifier.NUMBER)) {
			return number;
		}
		return null;
	}

	public String role() {
		if (isValidIdentifier(Identifier.ROLE)) {
			return role;
		}
		return null;
	}

	public String[] aliases() {
		if (isValidIdentifier(Identifier.ALIAS)) {
			return aliases;
		}
		return null;
	}

	public String[] titles() {
		if (isValidIdentifier(Identifier.TITLE)) {
			return titles;
		}
		return null;
	}

	public String[] tags() {
		if (isValidIdentifier(Identifier.TAG)) {
			return tags;
		}
		return null;
	}

	public String[] labels() {
		if (isValidIdentifier(Identifier.LABEL)) {
			return labels;
		}
		return null;
	}

	public Map<String, Identifier> getIdentifiers() {
		return identifiers;
	}

	public Map<Identifier, Boolean> getValidIdentifiers() {
		return validIdentifiers;
	}

	public void printIdentifiers() {
		for (Identifier x : Identifier.values()) {
			if (validIdentifiers.get(x)) {
				System.out.println(x.toString());
				for (String y : identifiers.keySet()) {
					if (identifiers.get(y) == x) {
						System.out.println(y);}
					
				}
			}
		}
	}

	public boolean isValidIdentifier(Identifier id) {
		return validIdentifiers.containsKey(id);
	}

	public static class Builder {
		// required
		private String key;
		private Map<String, Identifier> identifiers;
		private Map<Identifier, Boolean> validIdentifiers;

		// optional
		private String name;
		private String number;
		private String role;
		private String[] aliases;
		private String[] titles;
		private String[] tags;
		private String[] labels;

		public Builder() {
			key = UUID.randomUUID().toString();

			identifiers = new TreeMap<String, Identifier>();
			identifiers.put(key, Identifier.KEY);

			validIdentifiers = new TreeMap<Identifier, Boolean>();
			for (Identifier x : Identifier.values()) {
				validIdentifiers.put(x, false);
			}
			validIdentifiers.replace(Identifier.KEY, true);
		}

		public Builder name(String name) {
			this.name = name;
			identifiers(Identifier.NAME, name);
			return this;
		}

		public Builder number(int number) {
			return this.number(Integer.toString(number));
		}

		public Builder number(String number) {
			this.number = number;
			identifiers(Identifier.NUMBER, number);
			return this;
		}

		public Builder role(Role role) {
			return this.role(role.toString());
		}

		public Builder role(String role) {
			this.role = role;
			identifiers(Identifier.ROLE, role);
			return this;
		}
		
		public Builder aliases(String... aliases) {
			this.aliases = aliases;
			identifiers(Identifier.ALIAS, this.aliases);
			return this;

		}

		public Builder titles(String... titles) {
			this.titles = titles;
			identifiers(Identifier.TITLE, this.titles);
			return this;
		}

		public Builder tags(String... tags) {
			this.tags = tags;
			identifiers(Identifier.TAG, this.tags);
			return this;
		}

		public Builder labels(String[] labels) {
			this.labels = labels;
			identifiers(Identifier.LABEL, this.labels);
			return this;
		}

		public Identity build() {
			return new Identity(this);
		}

		private void identifiers( Identifier identifier, String... strings) {
			validIdentifiers.replace(identifier, true);
			for (String x : strings) {
				identifiers.put(x, identifier);
			}
		}
	}
}
