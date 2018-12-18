package pop.spaces.mocs;

import java.util.List;

import pop.spaces.blocks.Block;

/**
 * tree-like a competition that features a bracket, or brackets of some sort
 * 
 * @author Natasha Alberelli
 *
 */

public abstract class Tree extends Moc {

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
