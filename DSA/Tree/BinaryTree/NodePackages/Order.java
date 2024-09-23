package NodePackages;

import NodePackages.Node;

public class Order {
    public static void inorderTraversal(Node node) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left);
        System.out.print(node.data + " ");
        inorderTraversal(node.right);
    }

    public static void postorderTraversal(Node node) {
        if (node == null) {
            return;
        }
        postorderTraversal(node.left);
        postorderTraversal(node.right);
        System.out.print(node.data + " ");
    }

    public static void preorderTraversal(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }
}
