package LinkedList;

public class RemoveNthNode {
    static class Node {
        int data;
        Node next;

        Node(){
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

    static Node removeNode(Node head,int n){
        if(head == null || n <= 0){
            return null;
        }

        Node temp = head;
        int count = 0;

        while(temp != null){
            count++;
            temp = temp.next;
        }

        if(n > count){
            return head;
        }

        if(n==count){
            return head.next;
        }

        temp = head;

        int pos = count - n;
        while(pos > 1){
            temp = temp.next;
            pos--;
            
        }

        temp.next = temp.next.next;

        return head;
    }
    static void printList(Node head){
        if(head == null){
            System.out.println("NULL");
        }
        else{
            Node temp = head;

            while(temp!=null){
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.print("x");
        }
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next =  new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node result = removeNode(head,2);

        System.out.println("After removing the Node n:");
        printList(result);
    }
}
