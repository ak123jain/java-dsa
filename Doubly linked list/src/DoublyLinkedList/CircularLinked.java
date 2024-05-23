package DoublyLinkedList;

public class CircularLinked {
    public static void main(String[] args) {

    }
}

// circular linked list has two types
// 1. circular singly linked list

// 1  2  3  4  5  6
// h              tail
//    t
// when i want to travel the list then condition
// Node temp = head.next
// while(temp!=head){
//     sout(temp.val);
//     temp = temp.next
//         }


// tail is connected head
// to ye circular list bana raha ha

// 2. circular doubly linked list

// null <- 4 <->10 <-> 5 <-> 3 <-> 100 ->null
//         h                        t
//  tail head se link hoga
// tail ka next head hoga or head ka prev tail hoga

// all the nodes are identical in a circular linked list