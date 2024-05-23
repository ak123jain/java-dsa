package LinkedList;
// i want to print reverse list through recursion
public class Recursive2 {
    public static void displayr(Node head){
        if(head==null) return;// ham head ko jhuma rahe ha es baar
        displayr(head.next);// a.ext = b , b.next = c , c.next = d , d.next = e or e is null
        System.out.println(head.data);
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
        Node b = new Node(9);
        Node c = new Node(7);
        Node d = new Node(4);
        Node e = new Node(3);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        displayr(a);
    }
}

// 1   public static void displayr(Node head){   hmna yaha par head value receive kari a or niche phir se function ko call laga di a.next = b ka sath b ko pas kar diya b.next=c c ko pass kar diya on going
// 2       if(head==null) return;
// 3       displayr(head.next);
// 4     System.out.println(head.data);
//    }

//    displayr(null) jab hmara displayr ma null aa gaya to vo return ho gaya or jab return ho gata ha tab function vahi chala gata ha jaha usko phele call lagi thi 3 line or ya null khatam or null ko e na call lagai thi
//    displayr(e) jab ma e par tha line 1 tab mana e.next = null ka liye call lagaye thi line 3 par lekin null to khatam to ma line 4 par aa gaya or e print or ab e ko d nall call lagaya tha
//    displayr(d)  jab ma d par tha line 1 tab mana d.next = e ka liye call lagaye thi line 3 par lekin e to khatam to ma line 4 par aa gaya or d print aese ham reverse order ma print karege
//    displayr(c)
//    displayr(b)
//    displayr(a)