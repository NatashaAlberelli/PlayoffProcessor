package pop.properties;

import pop.interfaces.Nameable;

public abstract class NameAbstract implements Nameable {
	private String name;
	
	public NameAbstract(String name) {
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
