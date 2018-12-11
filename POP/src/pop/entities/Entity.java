package pop.entities;

import pop.entities.interfaces.Nameable;

public abstract class Entity implements Nameable {
	private String name;
	
	public Entity(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void setName(String name) {
		this.name = name;
	}
}
