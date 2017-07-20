package DataStructures;

public class LinkedListDetectACycle {
    Node head;

    public LinkedListDetectACycle() {
        head = new Node();
        head.data = 1;
        head.next = new Node();
        head.next.data = 2;
        head.next.next = new Node();
        head.next.next.data = 3;
        head.next.next.next = new Node();
        head.next.next.next.data = 4;
        head.next.next.next.next = new Node();
        head.next.next.next.next.data = 0;

    }

    public static void main(String[] args) {

        LinkedListDetectACycle cycle = new LinkedListDetectACycle();
        System.out.println("hello "+ cycle.hasCycle(cycle.head));
    }

    public boolean hasCycle(Node head) {
        if(head == null){
            return false;
        }else if(head.next == null){
            //prevent null pointer
            return false;
        }

        Node turtle = head.next;
        Node hare = head.next.next;

        while(true) {

            if(turtle == null || hare == null){
                return false;
            }

            if(turtle.next == null || hare.next == null ||
                    hare.next.next == null){
                return false;
            }

            if(turtle  == hare){
                return true;
            }

            turtle = turtle.next;
            hare = hare.next.next;
        }
    }

    class Node {
        int data;
        Node next;
    }

}

