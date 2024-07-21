package DSA.Tree;

class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data = data;
    }
}


class BinaryTree{
    Node root;
    public void insert(int data){
        insertRec(root, data);
    }
    public Node insertRec(Node root, int data){
        if(root==null){
            root = new Node(data);
        }
        else if(root.data>data){
            root.left=insertRec(root, data);
        }
        else if(root.data<data){
            root.right=insertRec(root, data);
        }
        return root;
    }
    public void inOrder(){
        inOrderRec(root);
    }
    public void inOrderRec(Node root){
         if(root!=null){
            inOrderRec(root.left); 
            System.out.println(root.data+" ");
            inOrderRec(root.right);
         }
    }
}


  
public class TreeImple {
    public static void main(String []args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(8);
        tree.insert(7);
        tree.insert(12);
        tree.insert(15);
        tree.insert(2);
        tree.insert(5);
        tree.inOrder();
    }
}
