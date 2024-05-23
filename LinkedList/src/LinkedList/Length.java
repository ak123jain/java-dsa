package LinkedList;
//we need to find the length of list
public class Length {

    public static int length(Node head){
        int count = 0;
         while(head!=null){
             count++;
             head = head.next;
         }
         return count;
    }
    public static class Node{// creating class from object
        int data;// int data type (value)
        Node next;
        Node(int data){// constructor
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(6);
        Node b = new Node(7);
        Node c = new Node(9);
        Node d = new Node(4);
        Node e = new Node(3);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        int Listlength = length(a);
        System.out.println(Listlength);
    }
}
