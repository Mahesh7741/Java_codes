package DSA.Tree;


class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data=data;
        left=right=null;
    }
}



public class BinaryTree {
    Node root;
    public BinaryTree(){
        root=null;
    }
    public void insert(int data){
        root=insertRec(root, data);
    }
    public Node insertRec(Node root,int data){
        if(root==null){
            root=new Node(data);
            return root;
        }
        else if(root.data>data){
            root.left=insertRec(root.left, data);
        }
        else if(root.data<data){
            root.right=insertRec(root.right, data);
        }
        return root;
    }

    public void inOrder(){
        inOrderRec(root);
    }

    public void inOrderRec(Node root){
        if(root != null){
            System.out.print(root.data+" ");
            inOrderRec(root.left);
            inOrderRec(root.right);
        }
    }

    public static void main(String []args){
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
