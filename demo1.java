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
public class demo1{
    public static void main(String[] args) {
        int[] arr = {2,3,4,5};
        Node y = new Node(arr[2]);
        System.out.println(y.data);
    }
}