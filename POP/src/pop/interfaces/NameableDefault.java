package pop.interfaces;

import pop.persons.Player;

public class NameableDefault extends NameableAbstract {
	
	public NameableDefault(String name) {
		super(name);
	}
	
	@Override
	public String toString() {
		return Player.class.getName() + ": " + getName();
	}
}
