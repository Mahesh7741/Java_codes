import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BFS {
    static Scanner sc;

    // Method to insert a node in the tree based on user input
    public static Node insert() {
        System.out.print("If data is null enter -1: ");
        int data = sc.nextInt();
        if (data == -1) {
            return null; // Return null if input is -1
        }
        Node node = new Node(data); // Create a new node with the given data
        System.out.print("Enter left for " + data + ": ");
        node.left = insert(); // Recursively insert left child
        System.out.print("Enter right for " + data + ": ");
        node.right = insert(); // Recursively insert right child
        return node; // Return the created node
    }
	
	public static void levelOrderBFS(Node root){
		if(root==null){
			return;
		}
		Queue<Node>queue=new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()){
			Node curr=queue.poll();
			System.out.print(curr.data + " " );
			if(curr.left !=null){
				queue.add(curr.left);				
			}
			if(curr.right !=null){
				queue.add(curr.right);
			}
		}
		
	}
	
    // Preorder traversal
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Inorder traversal
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Postorder traversal
    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in); 
        /*Node root = insert(); */
		Node root=new Node(1);
		root.left=new Node(2);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right=new Node(3);
		root.right.left=new Node(6);
		root.right.right=new Node(7);
		System.out.print("Level order Travels :");
		levelOrderBFS(root);
		System.out.println();
        System.out.print("PreOrder traversal: ");
        preorder(root);
        System.out.println();

        System.out.print("InOrder traversal: ");
        inorder(root); 
        System.out.println();

        System.out.print("PostOrder traversal: ");
        postorder(root); 
        System.out.println();
    }
}
