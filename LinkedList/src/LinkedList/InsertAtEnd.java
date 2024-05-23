package LinkedList;
// we want to add node at end of the list if only head is given
public class InsertAtEnd {

    public static class Node{
        int data;
        Node next;

        Node(int data){// constructor
            this.data = data;
        }
        }
    public static void display(Node head) {// we don't neded to receive an arguement because it is apart of linkedlist class
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

        public static void deleteAtIndex(int idx,Node head){
            Node temp = head;// temp ko pt kar diya
             //if(idx =size-1) tail = temp; this is valid and important but we didn't reconize size
            for(int i=1;i<=idx-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;

        }
        public static void insertAtEnd(Node head , int val){
            Node temp = new Node(val);
            Node t = head;
            while(t.next!=null){// condition for reaching tail
                t = t.next;// t ko aaga badana ka liye
            }
            t.next = temp;// t mera tail par pucuh gya ab ma uska aaga temp connect kar duga
        }
        

        public static void main(String[] args) {

            Node a = new Node(6);
            Node b = new Node(6);
            Node c = new Node(7);
            Node d = new Node(9);
            Node e = new Node(3);
            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;

            insertAtEnd(a,100);
            display(a);// 6 6 7 9 3 100
            deleteAtIndex(5,a);
            System.out.println();
            display(a);
        }
    }

// INSERT AT INDEX
// 5  3  9   8  16 null
//               t
// ma ek new node banaya temp name se usma or usma 87 dala or us temp node ko ma 16 se connect karuga to ma t ko head par point karuga or us t ko null se ek phele tak le gyuga
// or phir t ko temp se connect

// hma t ko tail tak le gana ha to jab tak t.next!=null null tab tak loop chalao

//DELETE AT INDEX

//  1   2   3       4          5   6
//      t   t.next  t.next.next
//temp ko head se idx-1 par le gaya man lete ha 3 node delete karna ha
// to ab ma 2 node ko 4 node se join kar duga to 3 aapna aap delete
// ma 2 node ka andar 4 ka adress dal duga
// mean t.next = t.next.next

// agar mene last node delete kari to ye case aata ha if(idx == size-1) to meri tail vo he rhe gati ha jisko delete kara tail = temp
 // idx jis idx par node delete karni ha
// 1  2   3  4  5  6  muje agar last node delete karni ha to temp ko idx-1 par le gaya
//              t  t.next
// to mera tail 6 he rhe jata ha esliye tail = temp if (idx = size-1) ha to

