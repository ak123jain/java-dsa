package LinkedList;
// agar mere paas head node ha or ma pure list print karna chata hu
public class HeadNode {
    public static class Node{

        int data;// int data type (value)

         Node next;
        Node(int data){// constructor
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(6);
        Node b = new Node(3);
        Node c = new Node(5);
        Node d = new Node(9);
        Node e = new Node(7);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        // ab muje head node ka through puri list print karni ha
//        System.out.println(a.next);
//        System.out.println(a.next.data);// b.data
//        System.out.println(a.next.next.data);//c.data
//        System.out.println(a.next.next.next.data);// d.data
//        System.out.println(a.next.next.next.next.data);// e.data

        // using for loop we can display the list
        // 6 3 5 9 7
        // a b c d e => temp ko a node par point kar diya
        Node temp = a;// new node nahi banaya bas temp ko point kar diya a par
        System.out.println(temp.data); // temp hmara a he ha
//        for(int i=1;i<=5;i++){
//            System.out.println(temp.data);// temp jis bhi variable ko point kar raha uska data ko print
//            temp = temp.next;// ham har baar next add karta jyege or variable aaga badte rahege a-> b -> c -> d -> e
//        }

        // jab tak lat element nahi aata tab tab chalega
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;// a.next = b to temp ma b aa gaya
        }

    }
}

//last node == tail node => phela node next node ko point karega par tail node null ko point karta ha
