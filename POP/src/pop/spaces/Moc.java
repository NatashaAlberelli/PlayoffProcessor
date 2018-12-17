package pop.spaces;

import java.util.List;

public abstract class Moc extends Sequence {
	public Moc(Block peak, List<Block> blocks, Block base) {
		super(peak, blocks, base);
	}
	
	public Moc(Block peak, Block base) {
		super(peak, base);
	}
	
	public Moc(List<Block> blocks) {
		super(blocks);
	}
}
