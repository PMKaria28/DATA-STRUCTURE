class Node{
    int data;
    Node next;
    Node(int data1,Node next1){
       this.data=data1;
        this.next=next1;
    }
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}
public class demo2 {
    public static Node convertARR2LL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover=temp;
        }
        return head;
    }
    private static int lengthOfLl(Node head){
        int count=0;
        Node temp = head;
        while(temp != null){
           // System.out.print(temp.data);
            temp=temp.next;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        Node head = convertARR2LL(arr);
        System.out.println(head.data);
        System.out.print(lengthOfLl(head));
        // Node temp = head;
        // while(temp != null){
        //     System.out.print(temp.data);
        //     temp=temp.next;
        // }
    }
}
// CONVERTING ARRAY TO LINKED LIST