package LinkedList;
// using recursion => reverse a linked list and return its head
public class reverse {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static Node reverse(Node head){// dry run in screen short
        if(head.next==null) return head;
        Node newHead = reverse(head.next); //1 <- 2 <- 4
        head.next.next = head; //  3 <- 4
        head.next = null;// head ko null point kara diya
        return newHead;
    }
    public static void display(Node head) {
        if (head == null) return;
        System.out.print(head.val + " ");// work
        display(head.next);
    }

        public static void displayreverse(Node head){
        if(head==null) return;
        displayreverse(head.next);// call
        System.out.print(head.val+" ");// work
        // reverse ma call phele hoti ha work baad ma
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(1);
        Node c = new Node(2);
        Node d = new Node(3);
        Node e = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        //displayreverse(a);
        display(a);
        System.out.println();
        Node r = reverse(a);// ye arguement bhi node leta ha or return bhi node esliye node
        display(r);
        System.out.println(r);
    }
}

// another method
// 5 -> 1 -> 2 ->  4 -> null
//  ma phele 5 ka baad jitna bhi node ha unko reverse kar duga
// phele ma 4 -> null ko reverse karuga base case => if(head.next == null ) return h;
//  5 -> 1 <- 2 <-  4 <- null
//  h    h.n
//  muje 1 ko point karana ha 5 ki taraf 1-> 5  h.n.n = h
// 5 <- 1 <- 2 <-  4 <- null
// 4 is my new head
//
//
//recursion isko reverse kar dega 1 se 4 tak

// please see the dry run in gallery
