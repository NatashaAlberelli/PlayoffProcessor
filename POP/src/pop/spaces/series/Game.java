package pop.spaces.series;

import java.util.List;

import pop.spaces.Sequence;
import pop.spaces.Series;

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
