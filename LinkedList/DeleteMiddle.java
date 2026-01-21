package LinkedList;

public class DeleteMiddle {
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

    static Node middleNode(Node head){
        if(head == null){
            return null;
        }
        if(head.next == null){
            head = head.next;
        }

        Node slow = head;
        Node fast = head;
        
        int count = 0;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            count++;
            fast = fast.next.next;
        }

        int ans = count;

        Node temp = head;

        while(ans > 1){
            temp = temp.next;
            ans--;
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
        head.next = new Node(3);
        head.next.next =  new Node(4);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(1);
        head.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.next = new Node(6);

        Node result = middleNode(head);

        System.out.println("The modified LinkedList:");
        printList(result);
        

    }
    
}
