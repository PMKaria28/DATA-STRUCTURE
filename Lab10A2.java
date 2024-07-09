import java.util.Scanner;
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
public class Lab10A2 {
    private Node head;

    public void addNewNode(int value){
        Node newNode = new Node(value);
        if(head==null){
            head=newNode;
        }
        else{
            Node current = head;
            while(current.next != null){
                current=current.next;
            }
            current.next=newNode;
        }
    }
    public void displayNode(){
        Node current=head;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }
    public void insertAtFirst(int value){
        Node newNode = new Node(value);
        if(head==null){
            head=newNode;
        }
        Node first=head;
        newNode.next=first;
        head=newNode;

    
    }
    public void deleteAtFirst(){
        if(head==null){
            System.out.println("the list is empty nothing to delete at first ");
        }else{
            Node first=head.next;
            head=first;
        }
    }
    public void insertAtLast(int value){
        Node newNode = new Node(value);
        if(head==null){
            head=newNode;
        }else{
            Node current = head;
            while(current.next != null){
                current=current.next;
            }
            current.next=newNode;
        }
    }
    public void deleteAtlast(){
        if(head==null){
            System.out.println("nothing to delete as list is empty");
        }else if(head.next ==null){
            head=null;
        }
        else{
            Node prev=head;
            Node last=head.next;
            while(last.next!=null){
                prev=last;
                last=last.next;
            }
            prev.next=null;
        }
    }
    // public void deleteAtPosition(int pos){
    //     if(head==null){
    //         System.out.println("the list is empty");
    //     }else{
    //         Node prev = head;
    //         Node current= head.next;
    //         Node after=head.next.next;
    //         int count=0;
    //         while(after.next!=null){
                
    //             if(count==pos){
    //                 prev.next=after;
    //                 break;
    //             }
    //             prev=current;
    //             current=after;
    //             after=after.next;
    //             count++;
    //         }
    //     }
    // }
    public void deleteAtPosition(int pos) {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
    
        // If the position is 0, delete the head node
        if (pos == 0) {
            head = head.next;
            return;
        }
    
        Node prev = head;
        Node current = head.next;
        Node after = current != null ? current.next : null;
        int count = 1; // Start counting from 1 because we are already at the second node
    
        while (current != null) {
            if (count == pos) {
                prev.next = after;
                return;
            }
            prev = current;
            current = after;
            after = (after != null) ? after.next : null;
            count++;
        }
    
        // If we reach here, the position was not found
        System.out.println("The position is not found");
    }
    
    public static void main(String[] args) {
        Lab10A2 list = new Lab10A2();
        Scanner sc = new Scanner(System.in);
        list.addNewNode(1);
        list.addNewNode(2);
        list.addNewNode(3);
        list.addNewNode(4);

        int choice;
       // list.printNode();
       do {
        System.out.println("Enter your choice:");
        System.out.println("1. Add new node");
        System.out.println("2. Display nodes");
        System.out.println("3. Insert at first");
        System.out.println("4. Delete at first");
        System.out.println("5. Insert at last");
        System.out.println("6. Delete at last");
        System.out.println("7. Delete at position");
        System.out.println("-1. Exit");

        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter value to add: ");
                int value = sc.nextInt();
                list.addNewNode(value);
                break;
            case 2:
                System.out.println("Nodes in the list:");
                list.displayNode();
                break;
            case 3:
                System.out.print("Enter value to insert at first: ");
                value = sc.nextInt();
                list.insertAtFirst(value);
                break;
            case 4:
                System.out.println("Deleting first node:");
                list.deleteAtFirst();
                break;
            case 5:
                System.out.print("Enter value to insert at last: ");
                value = sc.nextInt();
                list.insertAtLast(value);
                break;
            case 6:
                System.out.println("Deleting last node:");
                list.deleteAtlast();
                break;
            case 7:
                System.out.print("Enter position to delete: ");
                int pos = sc.nextInt();
                list.deleteAtPosition(pos);
                break;
            case -1:
                System.out.println("Exiting program.");
                break;
            default:
                System.out.println("Invalid choice. Please enter a valid option.");
        }
    } while (choice != -1);         
    // list.insertAtFirst(999);
    //      list.displayNode();

    //      list.deleteAtFirst();
    //      list.displayNode();

    //      list.insertAtLast(999);
    //      list.displayNode();

    //     System.out.println("after deleting at last ");
    //     list.deleteAtlast();
    //     list.displayNode();
    //     System.out.println("delete at position ");
    //     list.deleteAtPosition(3);
    //     list.displayNode();
    }
}
