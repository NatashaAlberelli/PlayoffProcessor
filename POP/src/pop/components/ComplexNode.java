package pop.components;

import pop.groups.Party;

public abstract class ComplexNode {
	private int partyCount;
	private int victorCount;
	private int theDistance;
	private boolean bestOf;
	Party[] parties;

	public ComplexNode(int partyCount, int victorCount, int theDistance, boolean bestOf) {
		this.partyCount = partyCount;
		this.victorCount = victorCount;
		this.theDistance = theDistance;
		this.bestOf = bestOf;
	}

	public int getPartyCount() {
		return partyCount;
	}

	public int getVictorCount() {
		return victorCount;
	}

	public int getTheDistance() {
		return theDistance;
	}

	public boolean isBestOf() {
		return bestOf;
	}
	
	public Party[] getParties() {
		return parties;
	}

	public abstract boolean isResolved();

	public abstract void resolve();

	/* needs to determine if an array of nodes can be used to create a new node.
	 * Things that must be the same:
	 * 
	 * 
	 */
	public abstract boolean areCompatibleNodes(ComplexNode[] compare);
	
	
	public static boolean areResolved(ComplexNode[] compare) {
		for (ComplexNode x : compare) {
			if(!x.isResolved()) {
				return false;
			}
		}
		return true;
	}
}
