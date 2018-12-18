package pop.spaces;

import java.util.Collection;

import pop.spaces.elements.Element;

public abstract class Space implements Element{
	private Collection<Element> elements;

	public Space() {
	}
	
	public Space(Collection<? extends Element> elements) {
		this.elements.addAll(elements);
	}
	
	public Collection<Element> getElements(){
		return elements;
	}
}
