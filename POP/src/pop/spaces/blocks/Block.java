package pop.spaces.blocks;

import java.util.List;

import pop.spaces.sequences.Sequence;
import pop.spaces.series.Series;

/**
 * A block starts and ends with a series, the starting series can be informed by
 * the ending series of another block. Studs from an informer block "interlock" into
 * the target block pipes just like Lego. 
 * 
 * @author Natasha Alberelli
 *
 */
public abstract class Block extends Sequence {
	

	public Block(Series pipes, List<Series> blocks, Series studs) {
		super(pipes, blocks, studs);
	}
	
	public Block(Series pipes, Series studs) {
		super(pipes, studs);
	}
	
	public Block(List<Series> events) {
		super(events);
	}
}
