package pop.properties;

import java.util.List;

import pop.interfaces.Nameable;

public abstract class GroupAbstract<T extends Nameable> implements Groupable<T> {
	
	private List<T> group;
	private int capacity;

	public GroupAbstract(List<T> group, int capacity) {
		this.group = group;
		this.capacity = capacity;
	}
	
	public GroupAbstract(List<T> group) {
		this(group, group.size());
	}
	
	@Override
	public int getGroupCount() {
		return group.size();
	}
	
	@Override
	public int getGroupCapacity() {
		return capacity;
	}
	
	@Override
	public void setGroupCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	@Override
	public boolean addGroupMember(T member) {
		if (group.size() >= getGroupCapacity()) {
			return false;
		}
		group.add(member);
		return true;
	}
	
	@Override
	public boolean removeGroupMember(T member) {
		if (group.contains(member)) {
			group.remove(member);
			return true;
		}
		return false;
	}
	
	@Override
	public List<T> getGroupMembers(){
		return group;
	}	
}
