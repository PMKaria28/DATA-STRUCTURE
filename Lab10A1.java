// Define the Node class
class Node {
    int data;
    Node next;

    // Constructor with data and next node
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    // Constructor with data only
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Lab10A1 {
    private Node head;

    // Method to add a new node to the end of the list
    public void addNewNode(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to print all nodes in the list
    public void printNodes() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data); // Print the data of the node
            current = current.next;
        }
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        Lab10A1 list = new Lab10A1();
        list.addNewNode(1);
        list.addNewNode(2);
        list.addNewNode(3);
        list.addNewNode(4);

        // Print all nodes in the list
        list.printNodes();
    }
}
