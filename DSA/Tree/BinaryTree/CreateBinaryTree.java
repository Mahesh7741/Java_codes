package NodePackages; // Use the same package as Node

import java.util.Scanner;

public class CreateBinaryTree {
    
    public static Node createBinary(Scanner sc) {
        System.out.println("Enter a data (or -1 for no node): ");
        int data = sc.nextInt();
        
        // Base case: if data is -1, return null indicating no node
        if (data == -1) {
            return null;
        }
        
        // Create the node
        Node node = new Node(data);
        
        // Recursively create left and right children
        System.out.println("Enter left child of " + data + ": ");
        node.left = createBinary(sc);
        
        System.out.println("Enter right child of " + data + ": ");
        node.right = createBinary(sc);
        
        return node; // Return the created node
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Start building the binary tree...");
        Node root = createBinary(scanner); // Create the binary tree
        scanner.close(); // Close the scanner
    }
}
