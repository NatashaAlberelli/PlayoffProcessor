package pop.spaces.series;

import java.util.List;

import pop.spaces.Block;
import pop.spaces.Moc;

/**
 * tree-like a competition that features a bracket, or brackets of some sort
 * 
 * @author Natasha Alberelli
 *
 */

public class Tree extends Moc {

	public Tree(Block peak, List<Block> blocks, Block base) {
		super(peak, blocks, base);
		// TODO Auto-generated constructor stub
	}

	public Tree(Block peak, Block base) {
		super(peak, base);
	}
	
	public Tree(List<Block> blocks) {
		super(blocks);
	}
}
