package pop.properties;

import java.util.List;

import pop.interfaces.Nameable;

/**
 * An interface for objects that contains a list of people, entrants, or items
 * 
 */
public interface Groupable<T extends Nameable> {
	public int getGroupCount();
	public int getGroupCapacity();
	public void setGroupCapacity(int capacity);
	public boolean addGroupMember(T member);
	public boolean removeGroupMember(T member);
	public List<? extends Nameable> getGroupMembers();
}
