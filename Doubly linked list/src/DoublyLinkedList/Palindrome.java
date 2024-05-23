package DoublyLinkedList;
// Palindrome in DoublyLinkedList
public class Palindrome {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){// constructor
            this.val = val;
        }
    }

    public static boolean palindrome(Node head){
        Node tail = head;
        while(tail.next!=null){// tail ko aapni position par le gaya
            tail = tail.next;
        }
        while(head!=tail){
            if(head.val!=tail.val) return false;
            head = head.next;
            tail = tail.prev;
        }
        return true;
    }
    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(9);
        Node d = new Node(10);
        Node e = new Node(4);

        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        boolean isPalindrome = palindrome(a);
        System.out.println("Is the linked list a palindrome? " + isPalindrome);

    }
}
