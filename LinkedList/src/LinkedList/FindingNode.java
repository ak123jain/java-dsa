package LinkedList;
// finding the nth node from the end of linked list only head is given
public class FindingNode {
    public static Node nthNode(Node head, int n){// n = nth from last
        int size = 0;
        Node temp = head;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        int m = size-n+1;// (m-n+1)// mth node from start to ab ham last se nahi start se nth node nikalege
        temp = head;
        for(int i=1;i<=m-1;i++){
            temp = temp.next;
        }
        return temp;
    }
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(6);
        Node b = new Node(1);
        Node c = new Node(300);
        Node d = new Node(4);
        Node e = new Node(8);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        Node q = nthNode(a,3);
        System.out.println(q.data);
    }
}


//       10 13  4  5  12   10
//       0   1  2  3   4   5 idx
//  m =  1   2  3  4   5   6
//       6   5  4  3   2   1  = n


// second node from last = 12
//m = 6
//
// formula : nth node from last = (m-n+1)th node from start
//                 4                6-4+1 = 3

// hma nth node last se niklene thi par vo equal ha (m-n+1)th node from the start ke so we can find out node from the start mera question palat gya

//      10  13  4  5  12  10
//       0   1  2  3   4   5 idx
//  m =  1   2  3  4   5   6

//now i am finding mth node from the first m = 4
// hma 4th mth node find karni ha first se to hma sirf head given ha to temp ko head se m-1 tak chaluga or return

// esma ham do baar traversal kar rahe ha ek baar size or ek baar temp ka liye







