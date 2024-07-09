class Node{
    int data;
    Node next;
    Node(int data,Node next){
        this.data=data;
        this.next=next;
    }
    Node(int data){
        this.data=data;
        this.next=null;
    }

}
public class Lab10C1 {
    private Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head; // Circular link to itself
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head; // Circular link to head
        }
    }
    public int countNodes() {
        if (head == null) {
            return 0;
        }
        int count = 0;
        Node current = head;
        do {
            count++;
            current = current.next;
        } while (current != head);
        return count;
    }
    public static void main(String[] args) {
        Lab10C1 list = new Lab10C1();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int nodeCount = list.countNodes();
        System.out.println("Number of nodes in the circular linked list: " + nodeCount);

    }
}
