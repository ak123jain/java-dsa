package DoublyLinkedList;

public class DoublyList {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){// constructor
            this.val = val;
        }
    }

    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp= temp.next;
        }
        System.out.println();
    }

    public static void displayrandom(Node random){// meeko random se head par jana ha phir list display karni ha
        Node temp = random;
        while(temp.prev!=null){
            temp= temp.prev;
        }
        while (temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node insertAtHead(Node head, int x){
        Node t = new Node(x);
        t.next = head;
        head.prev = t;
        head = t;
        return head;
    }

    public static Node deletehead(Node head){
        head = head.next;
        head.prev = null;
        return head;
    }
    public static void deleteTail(Node head){
        Node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
             }
        temp.next = null;
    }

    public static void deleteAtIdx(Node head, int idx) {
        Node temp = head;
        for (int i = 1; i <= idx - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;
    }

    public static void insertAtTail(Node head, int y){
        Node temp = head;
        while (temp.next!=null){// temp ko tail par le gaya
            temp = temp.next;
        }
        Node t = new Node(y);
         temp.next = t;
         t.prev = temp;
    }

    public static void insertAtIdx(Node head, int idx, int u){
        Node temp1 = head;
         for(int i =1;i<=idx-1;i++){
             temp1 = temp1.next;
         }
        Node temp2 = new Node(u);
        temp1.next.prev = temp2;
        temp2.prev = temp1;
        temp2.next = temp1.next;
        temp1.next = temp2;
    }

    public static void displayreverse(Node tail){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp= temp.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 4  10 2 99 13
        Node a = new Node(7);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);
       // null <- 4 <-> 10 <-> 2 <-> 99 <-> 13 -> null
        // null <- a <-> b <-> c <-> d <-> e -> null
        // a.prev =  null , e.next = null;
        a.prev = null;
        a.next= b;// a , b se connect ha or a null se connect ha
        b.prev = a;// b ka prev se a connect ha
        b.next = c;//
        c.prev = b;
        c.next= d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;
//        display(a);
//        displayreverse(e);
//        displayrandom(c);
           Node newhead = insertAtHead(a,900);
          display(newhead);
          insertAtTail(a,7688);// sirf head ko return kareni ki jarurat hoti ha tail ko nahi
          display(a);
          insertAtIdx(a,3,600);
          display(a);
          Node g = deletehead(a);
          display(g);
          deleteTail(a);
          display(a);
          deleteAtIdx(a,4);
          display(a);
    }
}


// we take up more memory

//   doubly linked list ma ek node aapna aaga vale node ko point kar rahi ha or prev vale ko bhi
// matlab node aaga vale node ka adress store kar rahi ha or prev vale ka bhi or aapn akhud ka dat bhi store kar rahi ha


// INSERTION AT HEAD
//  null <- 4 <->10 <-> 5 <-> 3 <-> 100 ->null
//          h                        t
// for insetion ek new node banaya Node t = new Node(30)

// 30
// t
// t.next = h;
// h.prev = t;
// h = t // phir h ko t par le aaya


// INSERTION AT TAIL
// Node j = new Node(87);
// tail.next = t;
// t.prev = tail;
// tail = t;

// INSET AT ANY INDEX

// null <- 4 <-> 10 <-> 5 <-> 3 <-> 100 -> null

// only head is given
// insertAtidx(head,3,600)
// ma temp ko 3 ind-1 par le jyuga
//

// null <- 4 <-> 10 <-> 5 <-> 3 <-> 100 -> null
///        h            t1   t1.n

//new node 600
//         t2

// phele prev connect kar
// temp1.next.prev = temp2
// temp2.prev = temp1
// temp2.next = temp1.next
// temp1.next = temp2


// DELETION head IN DDL

// null <- 4 <-> 10 <-> 5 <-> 3 <-> 100 -> null
//         h
// head = head.next
// head.prev = null


// delete tail when head is given

// null <- 4 <-> 10 <-> 5 <-> 3 <-> 100 -> null
//                            t

// while(temp.next.next!=null){
//     temp.next = null;
//         }

// DETELE AT IDX

// at idx 2
//null <- 4 <-> 10 <-> 5 <-> 3 <-> 100 -> null
//               t          t.n.n

// t.next = t.next.next

//null <- 4 <-> 10 <- 5 <-> 3 <-> 100 -> null
//              t           t.n
// 3 t.n esliye kyuki 10 5 se link nahi ha 10 3 se link ha
// t.next.prev = temp





















