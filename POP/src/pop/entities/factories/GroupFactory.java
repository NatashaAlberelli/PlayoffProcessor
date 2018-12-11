package pop.entities.factories;

public final class GroupFactory extends EntityFactory {
	@Override
	public EntityType getEntityType() {
		return EntityFactory.EntityType.GROUP;
	}
	
	private GroupFactory() {
	}
}
