package pop.components;

/**
 * An {@code EvenNode} represents a {@code Node} that has a procreation
 * constructor, meaning that a new {@code Node} can be created from other
 * {@code Node}s if:
 * 
 * <ul>
 * <li>all nodes passed in have been resolved</li>
 * <li>all nodes have the same party count and victor count</li>
 * <li>the sum of all nodes' victor counts is equal to a single party count</li>
 * </ul>
 * 
 * This class should only be extended if the sub-class is intended to be used
 * with those rules in mind.
 * 
 * @author natas
 *
 */
public abstract class EvenNode extends Node {

	public EvenNode(int partyCount, int victorCount, int theDistance, boolean bestOf) {
		super(partyCount, victorCount, theDistance, bestOf);
	}

	//Implement later
	/*
	public EvenNode(Node[] resolvedNodes) {
		if(areCompatibleNodes(resolvedNodes)) {
		}
	}*/

	@Override
	public boolean areCompatibleNodes(Node[] compare) {		
		int victorSum = 0;
		//accesses first element victor count to compare to the rest
		int testVictorCount = compare[0].getVictorCount();
		
		//check for equal victor count, adds to victor sum
		for (Node x : compare) {
			if (testVictorCount != x.getVictorCount()) {
				return false;
			}
			victorSum += x.getVictorCount();
		}
		
		//check for party count of all elements equal to victor sum
		for (Node x : compare) {
			if (victorSum != x.getPartyCount()) {
				return false;
			}
		}
		
		//Check for resolved
		return Node.areResolved(compare);
	}
	
	@Override
	public abstract boolean isResolved();

	@Override
	public abstract void resolve();
}
