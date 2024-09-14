package LinkedList;


class Node {
    int data;
    Node next; 

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class createLL {
    static Node convertArrToLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    static void traverseLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static int lengthOfLL(Node head) {
        int cnt = 0;
        Node temp = head;
        while (temp != null) {
            cnt++;
            temp = temp.next;
        }
        return cnt;
    }

    static boolean valueIsPresent(Node head, int value) {
        Node mover = head;
        while (mover != null) {
            int currentValue = mover.data;
            if (currentValue == value) {
                return true;
            }
            mover = mover.next; 
        }
        return false;
    }
    static void removeHead(Node head){
        if(head == null) {
            traverseLL(head);
        }
        Node temp=head.next;
        traverseLL(temp);
    }
    static void tailOfLL(Node head){
        if(head==null){
            traverseLL(head);  
        }
        Node mover=head;
        while(mover.next != null) {
            System.out.print(mover.data +" ");
            mover = mover.next;
        }
    }
    static Node removeKthElement(Node head,int k){
        if(head==null){
            return head ;
        }
        if(k==1){
            head = head.next;
            return head;
        }
        int cnt=0;
        Node temp=head;
        Node prev=null;
        while(temp !=null){
            cnt++;
            if(k==cnt){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }
    static Node removeElement(Node head, int value) {
        if (head == null) {
            return head;
        }
        if (head.data == value) {
            head = head.next;
            return head;
        }
        
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            if (temp.data == value) {
                prev.next = temp.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        
        return head;
    }
    static Node insertNode(Node head, int value, int position) {
        if (head == null) {
            if (position == 1) {
                head = new Node(value);
            }
            return head;
        }
        
        if (position == 1) {
            return new Node(value, head);
        }
        
        int cnt = 1;
        Node temp = head;
        while (temp != null && cnt < position - 1) {
            temp = temp.next;
            cnt++;
        }
        
        if (temp != null) {
            Node newNode = new Node(value);
            newNode.next = temp.next;
            temp.next = newNode;
        }
        
        return head;
    }
    
    
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        Node head = convertArrToLL(arr);
        
        // System.out.print("Original Linked List: ");
        // traverseLL(head);
    
        // Insert a node with value 5 at position 2
        head = insertNode(head, 5, 1);
        System.out.print("Linked List after inserting 5 at position 2: ");
        traverseLL(head);
        
        // Remove the 1st element
        // head = removeKthElement(head, 1);
        // System.out.print("Linked List after removing the 1st element: ");
        // traverseLL(head);
    }
    
}
