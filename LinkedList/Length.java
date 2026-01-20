package LinkedList;

public class Length {
    static class Node {
        int data;
        Node next;

        Node() {
            next = null;
        }

        Node(int data){
            this.data = data;
            this.next = null;
        }

        Node(int data,Node next){
            this.data = data;
            this.next = next;
        }
    }

    static int Length(Node head){
        if(head == null){
            return 0;
        }

        Node temp = head;
        int count = 0;

        while(temp != null){
            count++;
            temp =  temp.next;
        }

        return count;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        int len = Length(head);

        System.out.println("Length of Linked List: " + len);
    }
}