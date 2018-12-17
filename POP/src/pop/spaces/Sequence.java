package pop.spaces;

import java.util.Arrays;
import java.util.List;

import pop.spaces.elements.Element;

//consider making recursive and sequence interfaces to be implemented? or perhaps,
//a component of Series (influences the result/limit determination)

public abstract class Sequence extends Space implements Element {
	public final int HEAD_INDEX;
	public final int FOOT_INDEX;
	private List<Element> body;
	private Element head = null;
	private Element foot = null;

	public Sequence(Element head, List<? extends Element> body, Element foot) {
		super(body);
		super.getElements().add(head);
		this.HEAD_INDEX = body.size();
		super.getElements().add(foot);
		this.FOOT_INDEX = body.size() + 1;
		this.body.addAll(body);
		this.head = head;
		this.foot = foot;
	}

	public Sequence(Element head, Element foot) {
		super(Arrays.asList(new Element[] {
				head,
				foot
		}));
		this.body = null;
		this.head = head;
		this.HEAD_INDEX = 0;
		this.foot = foot;
		this.FOOT_INDEX = 1;
	}

	public Sequence(List<? extends Element> elements) {
		super(elements);
		int size = elements.size();

		this.HEAD_INDEX = 0;
		if (size < 1) {
			this.FOOT_INDEX = 0;
		} else {
			this.FOOT_INDEX = size - 1;
		}

		switch (size) {
		case 0:
			return;
		default:
			this.body.addAll(elements.subList(1, size - 2));
		case 2:
			this.foot = elements.get(size - 1);
		case 1:
			this.head = elements.get(0);
		}
	}

	public Element getHead() {
		return head;
	}

	public Element getFoot() {
		return foot;
	}
}
