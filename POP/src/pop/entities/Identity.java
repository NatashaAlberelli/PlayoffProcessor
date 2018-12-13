package pop.entities;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;

import pop.entities.roles.Role;

public class Identity {
	public enum Identifier {
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
	
	//required
	private String key;
	private Map<Identifier, String> identifiers;
	private Map<Identifier, Boolean> validIdentifiers;
	
	//optional
	private String name;
	private String number;
	private String role;
	private List<String> aliases;
	private List<String> titles;
	private List<String> tags;
	private List<String> labels;
	
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
	
	public List<String> aliases() {
		if (isValidIdentifier(Identifier.ALIAS)) {
			return aliases;
		}
		return null;
	}
	
	public List<String> titles() {
		if (isValidIdentifier(Identifier.TITLE)) {
			return titles;
		}
		return null;
	}
	
	public List<String> tags() {
		if (isValidIdentifier(Identifier.TAG)) {
			return tags;
		}
		return null;
	}
	
	public List<String> labels() {
		if (isValidIdentifier(Identifier.LABEL)) {
			return labels;
		}
		return null;
	}
	
	public Map<Identifier, String> getIdentifiers() {
		return identifiers;
	}
	
	public Map<Identifier, Boolean> getValidIdentifiers() {
		return validIdentifiers;
	}
	
	public void printIdentifiers() {
		for (Identifier x : Identifier.values()) {
			if (validIdentifiers.get(x)) {
				System.out.println(x.toString());
				System.out.println(identifiers.get(x));
			}
		}
	}
	
	public boolean isValidIdentifier(Identifier id) {
		return validIdentifiers.containsKey(id);
	}
	
	public static class Builder {
		//required
		private String key;
		private Map<Identifier, String> identifiers;
		private Map<Identifier, Boolean> validIdentifiers;
		
		//optional
		private String name;
		private String number;
		private String role;
		private List<String> aliases;
		private List<String> titles;
		private List<String> tags;
		private List<String> labels;
		
		public Builder() {
			key = UUID.randomUUID().toString();
			
			identifiers = new TreeMap<Identifier, String>();
			identifiers.put(Identifier.KEY, key);
			
			validIdentifiers = new TreeMap<Identifier, Boolean>();
			for (Identifier x : Identifier.values()) {
				validIdentifiers.put(x, false);
			}
			validIdentifiers.replace(Identifier.KEY, true);
		}
		
		public Builder name(String name) {
			this.name = name;
			identifiers(new String[] {this.name}, Identifier.NAME);
			return this;
		}
		
		public Builder number(int number) {
			return this.number(Integer.toString(number));
		}
		
		public Builder number(String number) {
			this.number = number;
			identifiers(new String[] {this.number}, Identifier.NUMBER);
			return this;
		}
		
		public Builder role(Role role) {
			return this.role(role.toString());
		}
		
		public Builder role(String role) {
			this.role = role;
			identifiers(new String[] {this.role}, Identifier.ROLE);
			return this;
		}
		
		public Builder aliases(String alias) {
			return this.aliases(new String[] {alias});
		}
		
		public Builder aliases(String[] aliases) {
			return this.aliases(Arrays.asList(aliases));
		}
		
		public Builder aliases(List<String> aliases) {
			this.aliases = aliases;
			identifiers(this.aliases, Identifier.ALIAS);
			return this;
		}
		
		public Builder titles(String title) {
			return this.titles(new String[] {title});
		}
		
		public Builder titles(String[] titles) {
			return this.titles(Arrays.asList(titles));
		}
		
		public Builder titles(List<String> titles) {
			this.titles = titles;
			identifiers(this.titles, Identifier.TITLE);
			return this;
		}
		
		public Builder tags(String tag) {
			return this.tags(new String[] {tag});
		}
		
		public Builder tags(String[] tags) {
			return this.tags(Arrays.asList(tags));
		}
		
		public Builder tags(List<String> tags) {
			this.tags = tags;
			identifiers(this.tags, Identifier.TAG);
			return this;
		}
		
		public Builder labels(String label) {
			return this.labels(new String[] {label});
		}
		
		public Builder labels(String[] labels) {
			return this.labels(Arrays.asList(labels));
		}	
		
		public Builder labels(List<String> labels) {
			this.labels = labels;
			identifiers(this.labels, Identifier.LABEL);
			return this;
		}	
		
		public Identity build() {
			return new Identity(this);
		}
		
		private void identifiers(String[] strings, Identifier identifier) {
			this.identifiers(Arrays.asList(strings), identifier);
		}
		
		private void identifiers(List<String> strings, Identifier identifier) {
			validIdentifiers.replace(identifier, true);
			for (String x : strings) {
				identifiers.put(identifier, x);
			}
		}
	}
}
