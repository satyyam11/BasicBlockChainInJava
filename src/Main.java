public class Main {
    public static void main(String[] args) {
        Blockchain blockchain = new Blockchain();

        // Adding blocks with sample data
        blockchain.addBlock("Hi I'm the first block");
        System.out.println("Trying to Mine block 1...");
        blockchain.addBlock("Yo I'm the second block");
        System.out.println("Trying to Mine block 2...");
        blockchain.addBlock("Hey I'm the third block");
        System.out.println("Trying to Mine block 3...");

        // Validate the blockchain
        System.out.println("Blockchain is Valid: " + blockchain.isChainValid());

        // Print the blockchain in the desired format
        System.out.println("\nThe block chain:");
        System.out.println("[");
        for (int i = 0; i < blockchain.getChain().size(); i++) {
            Block block = blockchain.getChain().get(i);
            System.out.println("  " + block);
            if (i < blockchain.getChain().size() - 1) {
                System.out.println(",");
            }
        }
        System.out.println("]");
    }
}