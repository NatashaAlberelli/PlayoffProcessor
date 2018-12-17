package pop.spaces;

import java.util.List;

import pop.spaces.elements.Element;

// might consider a recursive series to be a decorator of sorts, though
// implementation may be difficult, what allows an event to inform another? or
// be informed by? How difficult will it be to break a common set of result and
// prime states for a series event?

/**
 * a series, linear or recursive, that is informed by, or informs a series,
 * linear or recursive.
 * <p>
 * recursive event, where the results of a composite event inform, decide,
 * control, or influence the next group of events., example: the Regular season
 * NHL (season/qualifier) informs the standing of contestants in the playoffs
 * (Bracket/ tree-like), ex: the results of a season determine the start
 * standing of the next season, ex. regional qualifiers, inform state/province,
 * inform national, inform international, inform global, etc.
 * 
 * @author Natasha Alberelli
 *
 */
public abstract class Recursive extends Sequence {

	public Recursive(Element head, List<? extends Element> body, Element foot) {
		super(head, body, foot);
	}
}
