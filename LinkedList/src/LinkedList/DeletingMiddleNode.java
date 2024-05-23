package LinkedList;
// deleting middle node in the list
public class DeletingMiddleNode {
    public static void main(String[] args) {

    }
}

//in odd list
//1  2  3  4  5
//h
//s
//f
// slow = slow.next or fast = fast.next.next
//we want to delete 3 to muje 2 node par slow chahiye taki ma usko(3) ko delete kar saku
//slow ko 2 par rokna ha or fast ko null se 3 phele


//        1  2  3  4  5 null
//           s  f
//   fast rokna ha to condition fast.next.next.next!=null

//in even list
//1  2  3  4  5  6  null
//h
//s
//f
// slow = slow.next or fast = fast.next.next
//we want to delete 4 to muje 3 node par slow chahiye taki ma usko(4) ko delete kar saku
//slow ko 3 par rokna ha or fast ko 5 par rokna ha

//1  2  3  4  5  6  null
//      s     f

//fast.next.next!=null fast ko rokna ki condition

// while(fast.next.next!=null && fast.next.next.next!=null){
//         slow = slow.next;
//         fast = fast.next.next;
//         }
//         // yaha mera slow return hoga par mue slow ke side vala node delete karna ha
//
//in even list
//        1  2  3  4  5 null
//           s  f
//        muje slow ko 4 se connect karna ha slow.next = slow.next.next

// special case => when only head is given
// 1 null
// h
// s
// f  phele condition fast.next.next yaha kuch bhi nahi ha
//   if(head.next==null) return null;