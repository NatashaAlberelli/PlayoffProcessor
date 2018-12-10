package pop.groups;

import java.util.List;

import pop.interfaces.Entrant;
import pop.properties.GroupAbstract;

public abstract class GroupableEntrants<T extends Entrant> extends GroupAbstract<T> {
	
	public GroupableEntrants(List<T> group, int capacity){
		super(group, capacity);
	}
	
	public GroupableEntrants(List<T> group){
		super(group);
	}
	
	public List<T> getGroupEntrantMembers(){
		return super.getGroupMembers();
	}
}
