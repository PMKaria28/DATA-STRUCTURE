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
public class Lab11C1 {
    private Node head;
    public void addNewNode(int value){
        Node newNode = new Node(value);
        if(head==null){
            head=newNode;
        }else{
            Node current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=newNode;
        }
    }
    public void printNode(){
        Node current=head;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }
    public void removeDuplicates(){
        
        if(head==null){
            System.out.println("the list is empty");

        }if(head.next==null){
            System.out.println("it has only one element so no duplicats will be detected");
        }else{
            
            
            //      Node prev=head;
            //      Node current=head.next;
            //      Node after=head.next.next;
                
           
            
            // while(after!=null){
            //     Node dumPrev=prev;
            //     Node dumCurr=current;
            //     Node dumAfter=after;
            //     while(after!=null){
            //         if(dumPrev.data==dumAfter.data){
            //             dumCurr.next=dumAfter.next;
            //         }
            //         dumCurr=after;
            //         dumAfter=dumAfter.next;
            //     }
            //     prev=current;
            //     current=after;
            //     after=after.next;
            // }

            Node current = head;
        Node temp = current.next;
        Node previous = current;
        while(current != null) {
            while(temp != null) {
                if(temp.data == current.data) {
                    previous.next = temp.next;
                    temp = temp.next;
                    continue;
                }
                previous = temp;
                temp = temp.next;
            }
            current = current.next;
            if(current == null) return;
            previous = current;
            temp = current.next;
        }
            
        }

    }
    public static void main(String[] args) {
        Lab11C1 list = new Lab11C1();
        list.addNewNode(1);
        list.addNewNode(1);
        list.addNewNode(1);
        list.addNewNode(2);
        list.addNewNode(3);
        list.addNewNode(4);
        list.addNewNode(5);
        list.removeDuplicates();

        list.printNode();
    }
}
