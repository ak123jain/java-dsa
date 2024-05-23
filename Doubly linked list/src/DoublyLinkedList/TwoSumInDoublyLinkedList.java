package DoublyLinkedList;
// TwoSumInDoublyLinkedList are equal to given target yes or not
public class TwoSumInDoublyLinkedList {

    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){// constructor
            this.val = val;
        }
    }
    public static void palindrome(Node head){
        Node tail = head;
        int target = 16;
        while(tail.next!=null){// tail mera aapni jgah par pucuh gaya
            tail = tail.next;
        }
        while(head.val<=tail.val){
            if(head.val+tail.val==target){
                System.out.println("yes the sum of head.val : " + head.val + " and tail.val :  " + tail.val + " are equal to given target " );
                break;
            }
            else if(head.val+tail.val>target){
                tail = tail.prev;// tail ko piche le gyege kyuki list sorted ha incresing order ma
            }
            else{//head.val+tail.val<target  ab ma enka sum ki value increase karna chata hu
                head = head.next;// head ko aaga le gyege kyuki list sorted ha incresing order ma
            }
        }
    }
    public static void main(String[] args) {
        Node a = new Node(7);
        Node b = new Node(8);
        Node c = new Node(6);
        Node d = new Node(9);
        Node e = new Node(8);

        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;

        palindrome(a);
    }
}

//   3    5    8    13    100
//