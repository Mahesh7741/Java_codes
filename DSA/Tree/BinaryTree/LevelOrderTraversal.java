import java.util.*;

// Definition for a binary tree node
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    // Constructor to create a new tree node
    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class LevelOrderTraversal {

    // Function to create a tree from user input
    public static TreeNode createTree(Scanner sc) {
        System.out.print("Enter data (-1 for no node): ");
        int data = sc.nextInt();

        // If the input is -1, return null (no node)
        if (data == -1) {
            return null;
        }

        // Create a new node with the input data
        TreeNode node = new TreeNode(data);

        // Recursively create the left and right subtrees
        System.out.println("Enter left child of " + data + ": ");
        node.left = createTree(sc);
        System.out.println("Enter right child of " + data + ": ");
        node.right = createTree(sc);

        return node;
    }

    // Function to perform level order traversal of the tree
    public static void levelOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        // Use a queue to keep track of the nodes at each level
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            // Remove the front node from the queue
            TreeNode current = queue.poll();
            System.out.print(current.data + " ");

            // Add the left child to the queue if it exists
            if (current.left != null) {
                queue.add(current.left);
            }

            // Add the right child to the queue if it exists
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Create the binary tree:");
        TreeNode root = createTree(sc);

        System.out.println("Level Order Traversal:");
        levelOrderTraversal(root);
        
        sc.close();
    }
}
