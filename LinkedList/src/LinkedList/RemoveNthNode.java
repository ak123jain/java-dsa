package LinkedList;
// removing nth node from the end of linked list
public class RemoveNthNode {

    public static void display(Node head) {// we don't neded to receive an arguement because it is apart of linkedlist class
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static Node deleteNode2(Node head, int n) {// n = nth from last => return type node ha
        Node slow = head;
        Node fast = head;
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }
        if(fast==null){
            head = head.next;
            return head;// ye puri list return kar dega
        }
        while(fast.next != null) {// fast ko null se phele rokna ki condition
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;// ye puri list return kar dega
    }
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
         Node a = new Node(6);
         Node b = new Node(100);
         Node c = new Node(300);
         Node d = new Node(4);
         Node e = new Node(8);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        // 6  100  300  4  8

        a = deleteNode2(a,5);
        display(a);
    }
}

// first we find the nth node from end of the list like the previous question  and then delete it

//         10   13   4   5   12   10  null
//    idx   0   1    2   3    4    5
//
// mana aapna head par ek slow point kara or ek fast point kara

//Node slow = head
//Node fast = head

//eg find 2nd node from the last
//to ma fast ko 2 node aaga le gyuga

//for(int i=0;i<=n;i++){ n = node
//    fast = fast.next;
//        }

//         10   13   4   5   12   10  null
//          s        f
// ma fast or slow ko ek ek step sath ma move karuga
 // es baar mereko fast ko null se hele rokna ha or slow ko nth node(remove node) se ek phele node par

//         10   13   4   5     12     10  null
//                       s            f
//                       s           s.nn

// 12 node ko delete karna ha
// to ma slow ko fast se connect kar duga slow.next = slow.next.next

// if i want to delete last node from the end => (last node or head node)
// 1 2 3 4 5 => n = 5 node i want to be deleted from last
// it give an error bcoz mera fast utna chalta ha jitna muje nth given ha 5th to mera fast null ho gyega 2 condition fail
// to ek check mark dedo if (fast==null){ head = head.next } return




