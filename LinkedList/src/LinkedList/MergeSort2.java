package LinkedList;

public class MergeSort2 {
    public static void main(String[] args) {

    }
}

// without using extra space
//
//
//         1  3  5  8  9  null
//         t1
//  100
//   h
//   t
//
//          2   4    6  7  null
//          t2
//
// ma t1 or t2 ko compare karuga unma se jo chota hoga uska paas ma temp ko bhej duga or t1 ya t2 ko aaga shift kar duga
//
//         1  3   5  8  9  null
//         t  t1
//  100
//   h
//
//
//          2   4    6  7  null
//          t2

// es baar mera t2 chota ha to ma t ko t2 se connect kar duga or t2 ko aaga shift




//ListNode t1 = list1; list1 and list2 are head
//ListNode t2 = list1;
//ListNode h = new listNode(4);
// ListNode t = h;
//while(t1!=null && t2!=null){
//    if(t1.val<t2.val){
//            t.next = t1;
//             t1 = t;    // t1 ki jhag par t
//             t1 = t1.next;
//    }
//    else{
//        t.next = t2;
//        t2 = t;
//        t2 = t2.next
//        }
//        }
//if(t1==null){
//    t.next  = t2;
//        }
//else{
//     t.next = t1;
//        }
//return h.next











