package pop.spaces.series;

import java.util.List;

import pop.spaces.elements.Element;
import pop.spaces.sequences.Sequence;

/**
 * Any event that contains multiple events
 * 
 * @author Natasha Alberelli
 *
 */

public abstract class Series extends Sequence {
	
	//some kind of result, limit, etc.
	//perhaps a recursive/linear sequence type
	
	public Series(Element head, List<? extends Element> body, Element foot) {
		super(head, body, foot);
	}
	
	public Series(Element head, Element foot) {
		super(head, foot);
	}
	
	public Series(List<? extends Element> events) {
		super(events);
	}
}
