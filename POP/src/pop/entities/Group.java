package pop.entities;

import java.util.List;

public abstract class Group extends Entity {
	List<? extends Entity> entities;
	
	abstract boolean add(Entity entity);
	abstract Entity get(Entity entity);	
	abstract boolean remove(Entity entity);
	abstract Entity replace(Entity entity);
	abstract Entity[] getEntities();
}
