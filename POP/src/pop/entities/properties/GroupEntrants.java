package pop.entities.properties;

import java.util.List;

import pop.entities.individuals.Entrant;

public abstract class GroupEntrants<T extends Entrant> extends GroupAbstract<T> {
	
	public GroupEntrants(List<T> group, int capacity){
		super(group, capacity);
	}
	
	public GroupEntrants(List<T> group){
		super(group);
	}
	
	public List<T> getGroupEntrantMembers(){
		return super.getGroupMembers();
	}
}
