import java.util.ArrayList;
import java.util.List;

public class Blockchain {
    private List<Block> chain;
    private static final int DIFFICULTY = 4; // Number of leading zeros required in the hash

    public Blockchain() {
        chain = new ArrayList<>();
        createGenesisBlock();
    }

    private void createGenesisBlock() {
        Block genesisBlock = new Block(0, System.currentTimeMillis(), "Genesis Block", "0");
        chain.add(genesisBlock);
    }

    public void addBlock(String data) {
        Block newBlock = new Block(chain.size(), System.currentTimeMillis(), data, chain.get(chain.size() - 1).getHash());
        mineBlock(newBlock, DIFFICULTY);
        chain.add(newBlock);
    }

    private void mineBlock(Block block, int difficulty) {
        block.mineBlock(difficulty);
    }

    public boolean isChainValid() {
        for (int i = 1; i < chain.size(); i++) {
            Block currentBlock = chain.get(i);
            Block previousBlock = chain.get(i - 1);

            // Check if the current block's hash is correct
            if (!currentBlock.getHash().equals(currentBlock.calculateHash())) {
                return false;
            }

            // Check if the previous block's hash is correct
            if (!currentBlock.getPreviousHash().equals(previousBlock.getHash())) {
                return false;
            }

            // Check if the hash meets the mining difficulty
            if (!currentBlock.getHash().substring(0, DIFFICULTY).equals(new String(new char[DIFFICULTY]).replace('\0', '0'))) {
                return false;
            }
        }
        return true;
    }

    public List<Block> getChain() {
        return chain;
    }
}