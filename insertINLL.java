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

public class insertINLL {
    public static Node insertHead(Node head,int val){
        Node temp = new Node(100,head);

        return temp;
    }
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
    public static void print(Node head){
        while (head != null) {
            System.out.println(head.data+" ");
            head=head.next;
        }
    }
    public static Node insertTail(Node head,int val){
        if(head == null){
            return new Node(val);
        }
        Node temp = head;
        while (temp.next != null) {
            temp=temp.next;
        }
        Node newNode=new Node(val);
        temp.next=newNode;
        return head;
    }
    public static Node insertBeforeValue(Node head,int el,int val){
        if(head==null){
            return null;
        }
        if(head.data==val){
            return new Node(el,head);
        }
        
        Node temp = head;
        while(temp.next != null){
            
            if(temp.next.data==val){
                Node newNode = new Node(el,temp.next);
                temp.next=newNode;
                break;
            }
            temp=temp.next;
        }
        return head;
    }
    public static Node insertAtK(Node head,int el,int k){
        if(head==null){
            if(k==1){
                return new Node(el);
            }else{
                return head;
            }
        }
        if(k==1){
            return new Node(el,head);
        }
        int cnt=0;
        Node temp = head;
        while(temp != null){
            cnt++;
            if(cnt==(k-1)){
                Node newNode = new Node(el,temp.next);
                temp.next=newNode;
                break;
            }
            temp=temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {12,5,8,6};
        Node head = convertARR2LL(arr);
        head= insertBeforeValue(head, 100,6);
        print(head);
    }
}
