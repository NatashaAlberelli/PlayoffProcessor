package pop.persons;

public class PersonDefault extends PersonAbstract{

	public PersonDefault(String name) {
		super(name);
	}
	
	@Override
	public String toString() {
		return Player.class.getName() + ": " + super.getName();
	}
}
