package pop.entities.interfaces;

public abstract class NameableAbstract implements Nameable {
	private String name;
	
	public NameableAbstract(String name) {
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
