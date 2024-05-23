package LinkedList;

public class CycleInLinkedList {
    public static void main(String[] args) {

    }
}

// cycle in linked list => null nahi hota
//   3  2  0  -4   => -4 point towards 2
//   h
//   s
//   f
// use slow and fast => slow = slow.next or fast = fast.next.next
// agar mere fast or slow ek he node ppar ruk gaye to ye cycle ha
//   3  2  0  -4   => -4 point towards 2
//   h         f
//             s
//
// fast or slow -4 ka baad 2 par jyega
// condition for a cycle => fast!=slow tab tak chalata raho
//      while(fast!=slow){
//          slow = slow.next;
//          fast = fast.next.next;
//              }

// agar fast slow ka equal ho gaya to vo cycle ha loop break
// but one problem is arrive if null is exist in list then vo to mera cycle nahi ha

//while(fast!=null){// agar meri cycle hui to usma null nahi aata to ye chalta rhega
//        slow = slow.next;
//        fast = fast.next.next;
//        if(fast==slow) return true;
//        }
//      return false; //if fast = null return false
// 5 null
// for if if i had given only head to (fast = fast.next.next;) ye condition fail to head.next=null to return false

// if(fast.next==null) return false; agar ye null ho gaya fast.next.next error dega kyuki null ka next kuch nahi hota





