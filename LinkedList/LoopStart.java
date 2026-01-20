package LinkedList;

public class LoopStart {
    static class Node{
        int data;
        Node next;

        Node(){
        }

        Node(int data){
            this.data = data;
        }
        
        Node(int data,Node next){
            this.data = data;
            this.next = next;
        }
    }

        static Node loopStarts(Node head){
            Node entry = head;
            Node slow = head;
            Node fast = head;

            while(fast.next != null && fast.next.next != null){
                fast = fast.next.next;
                slow = slow.next;

                if(fast ==  slow){
                    while(entry != slow){
                        slow = slow.next;
                        entry = entry.next;
                    }
                    return entry;
                }
            }
            return null;
        }
    public static void main(String[] args) {
        Node head =  new Node(10);
        Node n1 =  new Node(20);
        Node n2 =  new Node(30);
        Node n3 =  new Node(40);
        Node n4=  new Node(50);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n3;

        Node Start = loopStarts(head);

        if(Start != null){
            System.out.println(Start.data + " ");
        }
        else {
            System.out.println("NULL");
        }
    }
}