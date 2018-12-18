package pop.spaces.mocs;

/**
 * A special kind of tree that can contain multiple tree, and allow trees that
 * inform each other. example: a losers bracket tournament, example: multi-tiered finals
 * 
 * @author Natasha Alberelli
 *
 */

public class NTierBracket extends Tree {
	public NTierBracket() {
		super(null);
	}
}
