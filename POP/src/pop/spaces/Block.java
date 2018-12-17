package pop.spaces;

import java.util.List;

public abstract class Block extends Sequence {
	public Block(Series stud, List<Series> plates, Series pipe) {
		super(stud, plates, pipe);
	}
	
	public Block(Series head, Series foot) {
		super(head, foot);
	}
	
	public Block(List<Series> events) {
		super(events);
	}
}
