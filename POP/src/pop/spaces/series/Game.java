package pop.spaces.series;

import java.util.List;

import pop.spaces.Series;
import pop.spaces.sequences.Sequence;

/**
 * a game is just a sequence of events, possible with a result per sub-sequence,
 * and total result. Example: a Hockey game has three periods, all with their
 * own results, and a game result.
 * 
 * @author Natasha Alberelli
 *
 */
public abstract class Game extends Series {
	public Game(Sequence head, List<? extends Sequence> body, Sequence foot) {
		super(head, body, foot);
	}

	public Game(Sequence head, Sequence foot) {
		super(head, foot);
	}

	public Game(List<Sequence> events) {
		super(events);
	}
}
