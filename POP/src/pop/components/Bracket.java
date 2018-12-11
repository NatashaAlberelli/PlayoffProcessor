package pop.components;

public class Bracket {
	
	int playerCount;
	ProtoNode[][] tree;
	
	public Bracket(int playerCount) {
		this.playerCount = playerCount;
		initTree();
	}
	
	public int getPlayers() {
		return playerCount;
	}
	
	public ProtoNode[][] getTree() {
		return tree;
	}
	
	public int getRoundCount() {
		return tree.length;
	}
	
	private void initTree() {
		//find nearest power of two without going over (ex. 15 would result in 8)
		int highestPowerOfTwo = Integer.highestOneBit(playerCount);
		
		//difference between player count and highest power of 2
		int difference = playerCount - highestPowerOfTwo;
		
		//bye count is difference between highest player of two and previous difference
		int byeCount = highestPowerOfTwo - difference;		
		
		//first round player count is total player count minus bye count;
		int byeRoundCount = playerCount - byeCount;
		
		int roundCount = 0;
		
		if (byeCount > 0) {
			roundCount++;
		}
		
		for (int i = highestPowerOfTwo; i > 0; i /= 2) {
			++roundCount;
		}

		tree = new ProtoNode[roundCount][];
		
		for (int i = 0; i < roundCount; i++) {
			if (byeCount > 0) {
				tree[i] = new ProtoNode[byeRoundCount];
				continue;
			}
			tree[i] = new ProtoNode[highestPowerOfTwo];
			highestPowerOfTwo /= 2;
		}
	}
}
