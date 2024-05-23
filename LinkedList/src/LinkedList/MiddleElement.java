package LinkedList;
// finding the middle element of linked list
public class MiddleElement {
    public static void main(String[] args) {

    }
}

// 100  13  4  5  12  10
// in one traversal
// in two traversal ham puri list ko travel karege or length retrive karege or us lengh ko half karege jo node milege vo return karege or dusri baar travel karege half length tak or node return karna ka liye

// in one traversal fast and slow point towards head
// we move slow to one step and ma fast ko double step move kar raha hu jab tak mera  fast !=null nahi ho gata tab tak


//   1  2  3  4  5  6 null
//   h        s        f
// for an even list
//while(fast!=null){
//        slow = slow.next;
//        fast = fast.next.next;
//        }

//  1  2  3  4  5  null
//  h     s     f     esma mereko fast ko null se phele rokna ha condition (fast.next!=null)
// for odd list
//  while(fast.next!=null){
//             slow = slow.next;
//            fast = fast.next.next;
//        }

//  while(fast!=null && fast.next!=null){ // esma jab mere dono condition true hogi jab tak ye loop chalega agar mera fast null ka equal hua to ye return kar dega ya fast.next == null hua to bhi return ar dega
//             slow = slow.next;
//            fast = fast.next.next;
//        }

// agar mere dono me se koi  ek condition bhi false hui to ye return kar dega or ye muje aase hi likhna ha varna error




