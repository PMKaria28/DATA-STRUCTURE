import java.util.EmptyStackException;
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
class Stack {
    private Node top; // Reference to the top node of the stack

    // Constructor to initialize an empty stack
    public Stack() {
        this.top = null;
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Method to push an element onto the stack
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top; // Set the next of new node to current top
        top = newNode; // Set the new node as the top
    }

    // Method to pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int poppedValue = top.data; // Get the data of the top node
        top = top.next; // Move top to the next node
        return poppedValue;
    }

    // Method to return the element at the top of the stack without removing it
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data; // Return the data of the top node
    }

    // Method to display the elements of the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        Node current = top;
        System.out.print("Stack (top to bottom): ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class Lab11A1 {
    public static void main(String[] args) {
        Stack stack = new Stack();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        // Display the stack
        stack.display();

        // Pop elements from the stack
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        // Display the stack after popping
        stack.display();

        // Peek the top element of the stack
        System.out.println("Top element: " + stack.peek());
    }
}
