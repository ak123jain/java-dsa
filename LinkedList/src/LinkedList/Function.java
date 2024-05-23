package LinkedList;
// print the list through function
public class Function {

    public static void display(Node head){// function
            Node temp = head;// temp head ko point kar raha
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;// head.next = a.next = b
        }
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
        Node b = new Node(3);
        Node c = new Node(6);
        Node d = new Node(3);
        Node e = new Node(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        display(a);
        //hma aapna head ko ya phir a ko temp ka andar hi dalna padega agar ham nahi dalege to phele bari ma to list print hogi par next time there will be nothing kyuki ma aapna head or a ko kho chuka hu kyuki head = head.next kar diya
//        while(head != null) {
//            System.out.println(temp.data);
//            head = head.next;// head.next = a.next = b
//        }
    }
}

