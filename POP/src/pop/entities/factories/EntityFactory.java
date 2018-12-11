package pop.entities.factories;

public abstract class EntityFactory extends Factory {
	
	public enum EntityPurpose {
		CONTESTANT,
		NON_CONTESTANT
	}
	
	public enum EntityType {
		GROUP,
		INDIVIDUAL
	}

	@Override
	public Type getFactoryType() {
		return Factory.Type.ENTITY;
	}
	
	public abstract EntityType getEntityType();
}
