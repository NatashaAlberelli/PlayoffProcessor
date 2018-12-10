package pop.groups;

import java.util.List;

import pop.properties.GroupAbstract;
import pop.properties.IndividualAbstract;

public abstract class GroupablePersons<T extends IndividualAbstract> extends GroupAbstract<T> {
	
	public GroupablePersons(List<T> group, int capacity){
		super(group, capacity);
	}
	
	public GroupablePersons(List<T> group){
		super(group);
	}
	
	public List<T> getGroupPersonMembers(){
		return super.getGroupMembers();
	}
}
