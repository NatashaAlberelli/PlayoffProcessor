package pop.spaces.sequences;

import java.util.Arrays;
import java.util.List;

import pop.spaces.Space;
import pop.spaces.elements.Element;
import pop.spaces.elements.Event;

//consider using an array as a backing structure, for this and space

public abstract class Sequence extends Space implements Event {
	public final int START_INDEX;
	public final int END_INDEX;
	private List<Element> body;
	private Element start = null;
	private Element end = null;
	SequenceProperty[] properties; 

	public Sequence(List<? extends Element> elements, SequenceProperty... properties) {
		this(elements);
		this.properties = properties;
	}
	
	public Sequence(Element start, List<? extends Element> body, Element end) {
		super(body);
		super.getElements().add(start);
		this.START_INDEX = body.size();
		super.getElements().add(end);
		this.END_INDEX = body.size() + 1;
		this.body.addAll(body);
		this.start = start;
		this.end = end;
	}

	public Sequence(Element start, Element end) {
		this(Arrays.asList(new Element[] {
				start,
				end
		}));
	}

	public Sequence(List<? extends Element> elements) {
		super(elements);
		int size = elements.size();

		this.START_INDEX = 0;
		
		if (size >= 2) {
			this.body.addAll(elements.subList(1, size - 2));
			this.start = elements.get(0);
			this.end = elements.get(size - 1);
			this.END_INDEX = size - 1;
		} else if (size == 2) {
			this.body = null;
			this.start = elements.get(0);
			this.end = elements.get(size - 1);
			this.END_INDEX = size - 1;
		} else if (size == 1) {
			this.body = null;
			this.start = elements.get(0);
			this.end = elements.get(0);
			this.END_INDEX = 0;
		} else {
			//replace this with exception
			this.END_INDEX = 0;
			return;
		}
	}

	public Element getStart() {
		return start;
	}

	public Element getEnd() {
		return end;
	}
}
