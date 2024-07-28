public class Lab12A1 {
    
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public void addLast(int data) {
        Node n2 = new Node(data);

        if (head == null) {
            head = n2;
            return;
        } 
        else {
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n2;

        }
    }

    public static void printData(){
        Node temp = head;

        if(head == null){
           System.out.println("Empty");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + "--> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }


    public void copy(){
        Lab12A1 c2 = new Lab12A1();
    
        Node temp = head;

        while(temp.next != null){
            c2.addLast(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Lab12A1 c1 = new Lab12A1();

        c1.addLast(0);
        c1.addLast(1);
        c1.addLast(2);
        c1.addLast(3);
        c1.addLast(4);
        c1.addLast(5);
        c1.addLast(6);

        System.out.println("old LL");
        printData();

        System.out.println("new LL");
        
    }
}