package LinkedList;
// finding the nth node from the end of linked list {in one traversal} and only head is given
public class FindingNode2 {

    public static Node nthNode(Node head, int n) {// n = nth from last
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        int m = size - n + 1;// (m-n+1)// mth node from start to ab ham last se nahi start se nth node nikalege
        temp = head;
        for (int i = 1; i <= m - 1; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public static Node nthNode2(Node head, int n) {// n = nth from last
        Node slow = head;
        Node fast = head;
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
         return slow;
    }
        public static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
            }
        }
        public static void main (String[]args){
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

             Node p = nthNode2(a, 4);
            System.out.println(p.data);

        }
    }



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

// jab tak mera fast null tak nahi chala jata tab ak ma tab tak ma slow or fast dono ko one one step aaga karta rhuga then slow will give me the node

//while(fast!=null){
//    slow = slow.next;
//    fast = fast.next;
//        }





