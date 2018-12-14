package pop.entities.identities;

public class MultiField extends IdentityDecorator{

	public MultiField(Identity identity, ID type, String... fields) {
		this(identity, type, false, fields);
	}
	
	public MultiField(Identity identity, ID type, boolean clear, String... fields) {
		super(type, identity, clear);
		if(type.isSingle()) {
			return;
		}
		super.addRowCells(fields);
	}
}
