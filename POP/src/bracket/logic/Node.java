/*
* Natasha Alberelli
*/
package bracket.logic;

import java.util.ArrayList;
import java.util.List;

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
public abstract class Node {

	private static final int MINIMUM_CONTESTANT_COUNT = 2;

	/** The list of {@code Contestants} */
	private List<Contestant> contestants;

	/** A total amount of contestants currently participating */
	private int contestantCount;

	/** The limit to number of contestants for this node */
	private int contestantCapacity;

	/** The total count of rounds, the N in best-of-N, or "the Distance". */
	private int theDistance;

	IndexOutOfBoundsException tooFewContestants = new IndexOutOfBoundsException(
			"Node must have a capacity of atleast 2 contestants");

	NullPointerException badContestantList = new NullPointerException(
			"Node must have a non-null, non-empty contestant list with atleast " + Node.MINIMUM_CONTESTANT_COUNT
					+ " contestants");

	public Node() {
		this(Node.MINIMUM_CONTESTANT_COUNT);
	}

	public Node(int cCap) throws IndexOutOfBoundsException {
		if (cCap < Node.MINIMUM_CONTESTANT_COUNT) {
			throw tooFewContestants;
		}
		this.contestantCapacity = cCap;
		contestants = new ArrayList<Contestant>(cCap);
	}

	public Node(List<Contestant> cList) throws NullPointerException {
		if (cList == null) {
			throw badContestantList;
		}
		if (cList.isEmpty() || cList.size() < Node.MINIMUM_CONTESTANT_COUNT) {
			throw badContestantList;
		}
		this.contestants = cList;
		contestantCount = cList.size();
		contestantCapacity = cList.size();
	}

	public int getContestCount() {
		return contestantCount;
	}

	public int getContestantCapacity() {
		return contestantCapacity;
	}

	public int getTheDistance() {
		return theDistance;
	}

	public void addContestant(Contestant c) {
		contestants.add(c);
	}
}
