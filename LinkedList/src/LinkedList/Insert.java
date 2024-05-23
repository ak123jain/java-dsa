

 package LinkedList;
// we want to add node at end of the list if only head is given
public class Insert {
    public static void display(Node head){// we don't neded to receive an arguement because it is apart of linkedlist class
        Node tempt = head;
        while(tempt!=null){
            System.out.print(tempt.data +" ");
            tempt = tempt.next;
        }
    }
    public static void insertAtEnd(Node head , int val){
        Node temp = new Node(val);
        Node t = head;
        while(t.next!=null){// condition for reaching tail
            t = t.next;// t ko aaga badana ka liye
        }
        t.next = temp;// t mera tail par pucuh gya ab ma uska aaga temp connect kar duga
    }
    public static class Node {
        int data;// int data type (value)
        Node next;// node is our data type and next is our adress

        Node(int data) {// constructor
            this.data = data;
        }

        public static void main(String[] args) {
            Node a = new Node(6);
            Node b = new Node(3);
            Node c = new Node(6);
            Node d = new Node(3);
            Node e = new Node(7);

            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;

            insertAtEnd(a,100);
            display(a);
        }
    }
}

// 5  3  9   8  16 null
//               t
// ma ek new node banaya temp name se usma or usma 87 dala or us temp node ko ma 16 se connect karuga to ma t ko head par point karuga or us t ko null se ek phele tak le gyuga
// or phir t ko temp se connect

// hma t ko tail tak le gana ha to jab tak t.next!=null null tab tak loop chalao

