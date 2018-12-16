package pop.entities;

import java.util.Comparator;
import java.util.List;

import pop.entities.actions.Actions;
import pop.entities.identities.Identity;

public abstract class Group extends Entity {
	
	//suspect
	List<? extends Entity> entities;
	private int count;
	private int capacity;
	
	public Group(Identity id, Actions actions) {
		super(id, actions);
	}
	
	public abstract boolean add(Entity entity);
	public abstract boolean remove(Entity entity);
	public abstract Entity get(int index);	
	public abstract int getIndex(Entity entity);
	public abstract Entity replace(Entity entity);
	public abstract List<? extends Entity> getEntities();
	public abstract Entity[] getEntityArray();
	public abstract void sort(Comparator<? extends Entity> comparator);
	
	public int getCount() {
		return count;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public static void sort(Group group, Comparator<? extends Entity> comparator) {
		
	}
}
