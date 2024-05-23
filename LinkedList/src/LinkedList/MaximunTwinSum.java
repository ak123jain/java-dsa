package LinkedList;

public class MaximunTwinSum {
    public static void main(String[] args) {

    }
}

// find the max twin sum of a linked list of even length

// 1   2   3   13   4   5   6   7      null
// h
// s
// f

// 1   2   3   13   4   5   6   7     null
// h
//     s
//         f

// 1   2   3   13   4   5   6   7      null
// h
//         s
//                   f

//slow ko left middle par rok duga

// 1   2   3   13   4   5   6   7      null
// h
//              s
//                          f


//fast.next.next!=null tab tak slow = slow.next fast = fast.next.next
// middle ka baad ka node ko reverse kar duga
// slow.next = reverse(slow.next)
// ek temp1 mana head par rakha
// or ek temp2  reverse list ka head par rakha
//
//
// 1   2   3   13   7   6  5  4     null
// h
// t1
//                  t2
//     t2 !=null
//  tab tak t1 t2 ka sum karuga or max sum nikaluga
