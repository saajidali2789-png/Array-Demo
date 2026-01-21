package LinkedList;

public class Sort012 {
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

    static Node sort012(Node head){
        if(head == null || head.next == null){
            return head;
        }

        int c0 = 0;
        int c1 = 0;
        int c2 = 0;

        Node temp = head;

        while(temp != null){

            if(temp.data == 0){
                c0++;
            }
            else if(temp.data == 1){
                c1++;
            }
            else{
                c2++;
            }

            temp = temp.next;
        }

        temp = head;

        while(temp!=null){
            if(c0 > 0){
                temp.data = 0;
                c0--;
            }
            else if(c1 > 0){
                temp.data = 1;
                c1--;
            }
            else {
                temp.data = 2;
            }
            temp = temp.next;
        }

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
        head.next = new Node(0);
        head.next.next =  new Node(2);
        head.next.next.next = new Node(0);
        head.next.next.next.next = new Node(1);

        Node result = sort012(head);
        System.out.println("The sorted list is:");
        printList(result);
        
    }
    
}
