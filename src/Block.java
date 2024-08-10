import java.util.Objects;

public class Block {
    private int index;
    private long timestamp;
    private String data;
    private String previousHash;
    private String hash;
    private int nonce;

    public Block(int index, long timestamp, String data, String previousHash) {
        this.index = index;
        this.timestamp = timestamp;
        this.data = data;
        this.previousHash = previousHash;
        this.hash = calculateHash(); // Calculate hash upon creation
        this.nonce = 0; // Initialize nonce
    }

    public String calculateHash() {
        String input = index + Long.toString(timestamp) + data + previousHash + nonce;
        return HashUtil.applySha256(input);
    }

    public void mineBlock(int difficulty) {
        String target = new String(new char[difficulty]).replace('\0', '0'); // Create a string of leading zeros
        while (!hash.substring(0, difficulty).equals(target)) {
            nonce++; // Increment nonce
            hash = calculateHash(); // Recalculate hash
        }
        System.out.println("Block Mined!!! : " + hash);
    }

    public int getIndex() {
        return index;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String getData() {
        return data;
    }

    public String getPreviousHash() {
        return previousHash;
    }

    public String getHash() {
        return hash;
    }

    @Override
    public String toString() {
        return "{\n" +
                "  \"index\": " + index + ",\n" +
                "  \"hash\": \"" + hash + "\",\n" +
                "  \"previousHash\": \"" + previousHash + "\",\n" +
                "  \"data\": \"" + data + "\",\n" +
                "  \"timeStamp\": " + timestamp + ",\n" +
                "  \"nonce\": " + nonce + "\n" +
                "}";
    }
}