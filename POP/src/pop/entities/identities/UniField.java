package pop.entities.identities;

public class UniField extends IdentityDecorator {
	
	public UniField(Identity identity, ID type,  String field){
		this(identity, type, false, field);
	}
	
	public UniField(Identity identity, ID type, boolean clear, String field){
		super(type, identity, clear);
		if (type.isSingle()) {
			super.addRow(field);
		}
	}
}
