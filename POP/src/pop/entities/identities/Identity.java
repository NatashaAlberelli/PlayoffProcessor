package pop.entities.identities;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import ch.LineAlign;
import ch.Printer;;

public abstract class Identity {
	public enum ID {
		// this is a priority order, to benefit from the default declaration ordering of
		// Enum comparable method with use as a key in a TreeMap, or TreeSet
		KEY("Key", true),
		NAME("Name", true),
		NUMBER("Number", true),
		//ROLE("Role", true),
		ALIAS("Aliases", false),
		TITLE("Titles", false),
		TAG("Tags", false),
		LABEL("Labels", false);

		private String header;
		private boolean singleUnique;

		private ID(String type, boolean singleUnique) {
			this.header = type;
			this.singleUnique = singleUnique;
		}

		public static final int LABEL_WIDTH = 9;

		public String getType() {
			return header;
		}

		public boolean isSingle() {
			return singleUnique;
		}

		public String toString() {
			return String.format("%-" + LABEL_WIDTH + "s", header);
		}
	}


	public static final int TABLE_WIDTH = 60;
	
	private Map<ID, Set<String>> populatedIDs = new TreeMap<ID, Set<String>>();
	private Map<ID, Boolean> validIDs = new TreeMap<ID, Boolean>();
	private ID type;

	public Identity(ID type) {
		for (ID x : ID.values()) {
			validIDs.put(x, false);
		}
		this.type = type;
	}

	public Identity(ID type, Identity id, boolean clearType) {
		this.type = type;
		this.validIDs = id.getValidAndInvalidIDs();
		this.populatedIDs = id.getPopulatedIDs();
		if (clearType) {
			populatedIDs.get(type).clear();
		}
	}

	protected void addRow(String... row) {
		validIDs.replace(type, true);
		populatedIDs.put(type, new TreeSet<String>(Arrays.asList(row)));
	}

	protected void addRowCells(String... cells) {
		if (isValidID(type)) {
			populatedIDs.get(type).addAll(Arrays.asList(cells));
		} else {
			addRow(cells);
		}
	}

	public void print() {
		Printer.printLine(Identity.TABLE_WIDTH);
		for (ID x : this.populatedIDs.keySet()) {
			Printer.title(x.getType(), '|', LineAlign.SPLIT, Identity.TABLE_WIDTH);
			Printer.printLine(Identity.TABLE_WIDTH);
			for (String y : this.populatedIDs.get(x)) {
				Printer.title("- " + y, '|' , '|',LineAlign.LEFT, Identity.TABLE_WIDTH);
			}
			Printer.printLine(Identity.TABLE_WIDTH);
		}
	}

	public Map<ID, Set<String>> getPopulatedIDs() {
		return populatedIDs;
	}

	public Map<ID, Boolean> getValidAndInvalidIDs() {
		return validIDs;
	}

	public boolean isValidID(ID id) {
		return validIDs.get(id);
	}

	public ID[] getValidIDs() {
		ID[] valids = new ID[1];
		for (ID x : ID.values()) {
			if (validIDs.get(x)) {
				System.arraycopy(x, 0, valids, valids.length, 1);
			}
		}
		return valids;
	}
}
