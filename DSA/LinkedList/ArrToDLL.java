class Node {
    int data;
    Node next;
    Node previous;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }
}

public class ArrToDLL {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        // Create the head of the doubly linked list
        Node head = new Node(arr[0]);
        Node current = head;

        // Build the doubly linked list from the array
        for (int i = 1; i < arr.length; i++) { // Start from 1 because head is already created
            Node temp = new Node(arr[i]); // Create a new node
            current.next = temp;          // Link the current node's next to the new node
            temp.previous = current;      // Link the new node's previous to the current node
            current = temp;               // Move current to the new node
        }

        // Print the doubly linked list to verify the structure
        printList(head);
    }

    // Function to print the doubly linked list
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
