package pop.entities.factories;

public final class IndividualFactory extends EntityFactory {

	@Override
	public EntityType getEntityType() {
		return EntityFactory.EntityType.GROUP;
	}
	
	private IndividualFactory() {
	}
}
