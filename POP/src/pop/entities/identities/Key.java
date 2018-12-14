package pop.entities.identities;

import java.util.UUID;

import pop.entities.identities.Key;

public class Key extends Identity {

	public Key() {
		super(ID.KEY);
		super.addRow(UUID.randomUUID().toString());
	}
}
