package pop.spaces;

import java.util.Collection;

import pop.spaces.elements.Element;

public abstract class Space implements Element{
	private Collection<Element> elements;

	public Space(Collection<? extends Element> elements) {
		this.elements.addAll(elements);
	}
	
	public Collection<Element> getElements(){
		return elements;
	}
	
	/*
	private static <T, S extends T> void addInternal(List<T> list, int index, S element) {
		list.add(index, element);
	}
	
	public static void add(Space space, int index, Element element) {
		Space.addInternal((List<Element>)space.getElements(), index, element);
	}
	*/
}
