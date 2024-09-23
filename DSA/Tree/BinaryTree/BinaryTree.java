/*import java.util.Scanner;

import NodePackages.Node;
import NodePackages.Order;
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

   /* public static void inorderTraversal(Node node) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left);
        System.out.print(node.data + " ");
        inorderTraversal(node.right);
    }
	public static void postorderTraversal(Node node){
		if(node==null){
			return;
		}
		postorderTraversal(node.left);
		postorderTraversal(node.right);
		System.out.print(node.data+" ");
	}
	public static void priorderTraversal(Node node){
		if(node==null){
			return;
		}
		System.out.print(node.data+" ");
		priorderTraversal(node.left);
		priorderTraversal(node.right);
	} */
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = createTree(sc);
        System.out.print("Inorder Traversal:");
        Order.inorderTraversal(root);
		System.out.println();
		System.out.print("Postorder Traversal:");
		Order.postorderTraversal(root);
		System.out.println();
		System.out.print("Priorder Traversal:");
		Order.priorderTraversal(root);
        sc.close(); 
    }
} */

import java.util.Scanner;
import NodePackages.Node;
import NodePackages.Order;

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = createTree(sc);
        
        System.out.print("Inorder Traversal: ");
        Order.inorderTraversal(root);
        System.out.println();
        
        System.out.print("Postorder Traversal: ");
        Order.postorderTraversal(root);
        System.out.println();
        
        System.out.print("Preorder Traversal: ");
        Order.preorderTraversal(root);
        
        sc.close();
    }
}
