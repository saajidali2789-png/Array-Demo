package LinkedList;

//this is approach which using the extra space for this we need to optimize this solution
// public class OddEvenLL {
//     static class Node {
//         int data;
//         Node next;

//         Node(){
//             next = null;
//         }
//         Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//         Node(int data,Node next){
//             this.data = data;
//             this.next = next;
//         }
//     }

//     static Node OddEven(Node head){

//         if(head == null || head.next == null){
//         return head;
//     }

//     List<Integer> list = new ArrayList<>();

//     Node temp = head;

//     while(temp!= null && temp.next != null){
//         list.add(temp.data);
//         temp = temp.next.next;
//     }

//     if(temp != null){
//         list.add(temp.data);
//     }

//     temp = head.next;

//     while(temp!= null && temp.next != null){
//         list.add(temp.data);
//         temp = temp.next.next;
//     }

//     if(temp != null){
//         list.add(temp.data);
//     }

//     temp = head;
//     int i = 0;

//     while(temp != null){
//         temp.data = list.get(i);
//         i++;
//         temp = temp.next;
//     }
//     return head;
//     }

//     static void printList(Node head){
//         if(head == null){
//             System.out.println("NULL");
//         }
//         else{
//             Node temp = head;

//             while(temp!=null){
//                 System.out.print(temp.data + "->");
//                 temp = temp.next;
//             }
//             System.out.println();
//         }
//     }


//     public static void main(String[] args) {
//         Node head = new Node(2);
//         head.next = new Node(1);
//         head.next.next =  new Node(3);
//         head.next.next.next = new Node(5);
//         head.next.next.next.next = new Node(6);
//         head.next.next.next.next.next = new Node(4);
//         head.next.next.next.next.next.next = new Node(7);

//         Node result = OddEven(head);


//         System.out.println("The resulting LinkedList");
//         printList(result);


        
//     }
// }
//optimal solution
public class OddEvenLL {
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

    static Node OddEven(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node Odd = head;
        Node Even = head.next;
        Node evenHead = Even;

        while(Even != null && Even.next != null){
            Odd.next = Even.next;
            Odd = Odd.next;
            Even.next = Odd.next;
            Even = Even.next;
        }
        Odd.next = evenHead;

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
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(1);
        head.next.next =  new Node(3);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(6);
        head.next.next.next.next.next = new Node(4);
        head.next.next.next.next.next.next = new Node(7);

        Node result = OddEven(head);


        System.out.println("The resulting LinkedList");
        printList(result);

    }
}
