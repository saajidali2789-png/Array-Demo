package LinkedList;
import java.util.*;
public class SortLinkedList {
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

    static Node sortLL(Node head){
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }

        List<Integer> list = new ArrayList<>();

        Node temp = head;

        while(temp!=null){
            list.add(temp.data);
            temp = temp.next;
        }


        int n = list.size();

        for(int i = 0 ; i < n - 1; i++){
            for( int j = 0; j < n - i- 1;j++){
                if(list.get(j) > list.get(j+1)){

                    int swap = list.get(j);//another new thing we find in list swap syntax
                    list.set(j,list.get(j+1));
                    list.set(j+1,swap);
                }
            }
        }

        temp = head;
        int i = 0;

        while(temp!=null){
            temp.data = list.get(i);
            i++;
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
        Node head = new Node(-1);
        head.next = new Node(5);
        head.next.next =  new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(0);

        Node result = sortLL(head);
        System.out.println("The sorted list is:");
        printList(result);
        
    }
    
}
