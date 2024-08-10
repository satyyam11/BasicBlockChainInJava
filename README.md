# Basic Blockchain in Java

This project is a simple implementation of a blockchain in Java. It demonstrates the basic structure and functionality of a blockchain, including:

- **Block creation:** Each block contains a timestamp, transaction data, and a hash of the previous block.
- **Hash generation:** The SHA-256 algorithm is used to generate the hash of each block.
- **Chain validation:** The integrity of the blockchain can be verified by checking the hash of each block.

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- IDE (e.g., IntelliJ IDEA, Eclipse)

## Usage
The project includes the following classes:
- **Block:**  Represents a single block in the blockchain, containing a timestamp, transaction data, and the hash of the previous block.
- **Blockchain:** Manages the creation and validation of the blockchain.
- **HashUtil:** Provides utility methods for generating SHA-256 hashes.
- **Main:**  The entry point of the application, demonstrating the usage of the blockchain.
To use the blockchain in your own project, you can integrate the Block and Blockchain classes into your codebase.

## Contributing
- Contributions are welcome! If you find any issues or have suggestions for improvements, please feel free to open an issue or submit a pull request.

## License
- This project is licensed under the MIT License. See the LICENSE file for details.
