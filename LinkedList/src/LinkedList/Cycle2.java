package LinkedList;

public class Cycle2 {
    public static void main(String[] args) {

    }
}

// Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null
// node at which the tail node points => aase node jisko tail node point kar rahe ho
// 1  2  3  4  5
// 5 node 2 node ko point kar rahe ha 5 is tail node , tail node 2 ko point kar rahe ha so 2 is the ans
// 2 node se cycle start ho rahi ha to 2 ans ha

// slow = slow.next fast = fast.next.next jab slow or fast qual ho gaye tab break kar de
// or ek temp ko head par point kar de
// slow = slow.next temp = temp.next jab tak slow or temp equal nahi hote

//while(fast!=null){// agar meri cycle hui to usma null nahi aata to ye chalta rhega
//        slow = slow.next;
//        fast = fast.next.next;
//        if(fast==slow) return break;
//        }
//     Node temp = head;
//      while(temp!=slow){
//          temp = temp.next;
//          slow = slow,next;
//              }
//          return slow;

// question : meri fast ki speed 3X 4X bhi ho sakti ha tab bhi ans aa gayega interviewr question









