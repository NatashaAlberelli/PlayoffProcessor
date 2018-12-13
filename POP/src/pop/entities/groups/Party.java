package pop.entities.groups;

import java.util.ArrayList;
import java.util.List;

import pop.entities.individuals.Entrant;

/**
 * This class is intended to represent a container for an {@code Entrant}, or
 * multiple entrants in a tournament that has multiple contestants within it
 * such as a team.
 * 
 * @author Natasha Alberelli
 *
 */
public abstract class Party extends GroupEntrant {

	List<? extends Entrant> members;

	public Party(String name) {
		this(name, new ArrayList<Entrant>());
	}

	public Party(String name, List<? extends Entrant> members) {
		super(name);
		this.members = members;
	}

	public List<? extends Entrant> getMembers() {
		return members;
	}
}
