package pop.entities.properties;

import java.util.List;

import pop.entities.Nameable;

public class GroupDefault<T extends Nameable> extends GroupAbstract<T>{

	public GroupDefault(List<T> group) {
		super(group);
	}
	
	public GroupDefault(List<T> group, int capacity) {
		super(group, capacity);
	}
}
