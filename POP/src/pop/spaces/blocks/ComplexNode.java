package pop.spaces.blocks;

import pop.entities.Entity;

/**
 * A {@code Node} represents an individual game, round, bout, series or match;
 * the amount of rounds or best-of-N games in that round, bout, or series and a
 * list of {@code Contestant}s, usually two. For example, a round could have
 * many bouts, or best-of series, or just one game. In NHL playoffs, a round
 * consists of a best-of-seven series.
 * <p>
 * The purpose of a {@code Node} is to represent an individual face-off,
 * match-up, fight, or any other competition between a number of
 * {@code Contestant}s where winner(s) and loser(s) are determined.
 * <p>
 * {@code Nodes} can be used in a {@code Tree} bracket, each node representing a
 * match-up, game, or round in the overall bracket, or can be used in a single
 * round competition setup such as a Battle Royale, free-for-all, death-match,
 * fight, duel or race.
 *
 * @author Natasha Alberelli
 * @version 1.0
 * @since JDK1.8
 */

public abstract class ComplexNode {
	public enum Resolution {
		WAITING,
		IN_PROGRESS,
		RESOLVED,
		DRAW;
	}
	private static final int MINIMUM_CONTESTANT_COUNT = 2;
	
	private int contestantCapacity;
	private int victorCount;
	private boolean bestOf;
	Entity[] parties;
	
	private Resolution state = Resolution.WAITING;
	

	IndexOutOfBoundsException tooFewContestants = new IndexOutOfBoundsException(
			"Node must have a capacity of atleast 2 contestants");

	NullPointerException badContestantList = new NullPointerException(
			"Node must have a non-null, non-empty contestant list with atleast " + MINIMUM_CONTESTANT_COUNT
					+ " contestants");
	
	public ComplexNode(int victorCount,  boolean bestOf) {
		this.victorCount = victorCount;
		this.bestOf = bestOf;
	}
	
	public Resolution getState() {
		return state;
	}
	
	public void setState(Resolution r) {
		state = r;
	}
	
	
	public abstract Entity[] getWinner();
	public abstract Entity[] getLoser();

	public int getPartyCount() {
		return parties.length;
	}


	public int getContestantCapacity() {
		return contestantCapacity;
	}
	
	public int getVictorCount() {
		return victorCount;
	}

	//make this a calculation based on the series within
	public abstract int getTheDistance();

	public boolean isBestOf() {
		return bestOf;
	}
	
	public Entity[] getParties() {
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
	public abstract class EvenNode extends ComplexNode {

		public EvenNode(int victorCount, boolean bestOf) {
			super(victorCount, bestOf);
		}

		//Implement later
		/*
		public EvenNode(Node[] resolvedNodes) {
			if(areCompatibleNodes(resolvedNodes)) {
			}
		}*/

		@Override
		public boolean areCompatibleNodes(ComplexNode[] compare) {		
			int victorSum = 0;
			//accesses first element victor count to compare to the rest
			int testVictorCount = compare[0].getVictorCount();
			
			//check for equal victor count, adds to victor sum
			for (ComplexNode x : compare) {
				if (testVictorCount != x.getVictorCount()) {
					return false;
				}
				victorSum += x.getVictorCount();
			}
			
			//check for party count of all elements equal to victor sum
			for (ComplexNode x : compare) {
				if (victorSum != x.getPartyCount()) {
					return false;
				}
			}
			
			//Check for resolved
			return ComplexNode.areResolved(compare);
		}
	}
}
