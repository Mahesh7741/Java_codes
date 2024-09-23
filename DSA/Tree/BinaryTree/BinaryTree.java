import java.util.Scanner;

import NodePackages.Node;

public class BinaryTree {
    public static Node createTree(Scanner sc) {
        System.out.println("Enter a data (or -1 for no node): ");
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }
        Node node = new Node(data);

        System.out.println("Enter left child of " + data + ": ");
        node.left = createTree(sc); 

        System.out.println("Enter right child of " + data + ": ");
        node.right = createTree(sc); 

        return node;
    }

    public static void inorderTraversal(Node node) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left);
        System.out.print(node.data + " ");
        inorderTraversal(node.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = createTree(sc);
        System.out.println("Inorder Traversal:");
        inorderTraversal(root);
        sc.close(); 
    }
}
