package pop.entities.identities;

public abstract class IdentityDecorator extends Identity {
	
	public IdentityDecorator(ID type, Identity identity, boolean clear) {
		super(type, identity, clear);
	}
}
