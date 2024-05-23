package LinkedList;
// dispalay the list using recursively
public class Recursively {

    public static void displayr(Node head){
        if(head==null) return;// ham head ko jhuma rahe ha es baar
        System.out.println(head.data);
        displayr(head.next);
    }
    public static class Node{// creating class from object
        int data;// int data type (value)
        Node next;
       Node(int data){// constructor
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(6);// ye hmara yaha par data esliye aaya kyuki hmna obj ko initialize kar diya
        Node b = new Node(8);
        Node c = new Node(4);
        Node d = new Node(9);
        Node e = new Node(2);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        displayr(a);
    }
}
