package pop.entities.factories;

public enum FactoryType implements FactoryEnum {
	FACTORY_FACTORY {
		@Override
		public Factory getFactory() {
			// TODO Auto-generated method stub
			return null;
		}
	},
	ENTITY {
		@Override
		public Factory getFactory() {
			return null;
		}
	};

	@Override
	public abstract Factory getFactory();
}
