package pop.spaces;

import java.util.List;

import pop.spaces.blocks.Block;
import pop.spaces.sequences.Sequence;

public abstract class Moc extends Sequence {
	public Moc(Block base, List<Block> blocks, Block peak) {
		super(base, blocks, peak);
	}
	
	public Moc(Block base, Block peak) {
		super(base, peak);
	}
	
	public Moc(List<Block> blocks) {
		super(blocks);
	}
}
