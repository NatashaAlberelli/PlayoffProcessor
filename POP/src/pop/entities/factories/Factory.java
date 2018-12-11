package pop.entities.factories;

public abstract class Factory {
	public enum Type {
		ENTITY,
		ENTRANT;
	}
	
	protected abstract Type getFactoryType();
}
