package DoublyLinkedList;

public class FlattenMultilevelDoublyLinkedLink {
    public static void main(String[] args) {

    }
}

// leetcode 430
// you can see flatter image
// 1 <-> 2 <-> 3 <-> 4 <-> 5 <-> 6
//             |
//             7 <-> 8 <-> 9 <-> 10
//                   |
//                  11 <-> 12

//   1 ka child pointer null ko point kar raha ha
// 3 ka child pointer 7 ko point kar raha ha
// 8 ka child pointer 11 ko point kar raha ha

// esma 3 pointer ha ek  next , prev ,  child

//class{
//    int data;
//    Node next;
//    Node prev;
//    Node child;
//        }

// with respect to flatter img
//Input: head = [1,2,3,4,5,6,null,null,null,7,8,9,10,null,null,11,12]
//        Output: [1,2,3,7,8,11,12,9,10,4,5,6]

//
// 1 <-> 2 <-> 3 <-> 4 <-> 5 <-> 6
//             |
//             7 <-> 8 <-> 9 <-> 10
//                   |
//                  11 <-> 12

// phele last 2 step ko resolve karna ha
//             7 <-> 8 <-> 9 <-> 10
//                   |
//                  11 <-> 12

// 7 <-> 8 <-> 11 <->12 <-> 9 <-> 10

// h           t     z
// 1 <-> 2 <-> 3 <-> 4 <-> 5 <-> 6
//             |
//             7 <-> 8 <-> 9 <-> 10
//           t.child
//                   |
//                  11 <-> 12
//               t.child

// 7 <-> 8 <-> 11 <->12 <-> 9 <-> 10

// 3 ka child 7 ha or 8 ka child 11
// mereko temp ko aase node par rokna ha jiska child ha
// Node temp = head
//while(temp!=null){
//    Node z = temp.next;// taki merepe paas temp.next ka bhi access rahe
//    if(temp.child!=null){// matlab agar uska chid ha to ma usko thik karka la raha hu kuch aase thik karega 7 <-> 8 <-> 11 <->12 <-> 9 <-> 10
//        Node c = flatten(temp.child); 7 <-> 8 <-> 11 <->12 <-> 9 <-> 10 ye mera thik ho gaya
//        temp.next = c;// ab mana 3 ko 7 se jod diya
//        c.prev = temp;// or 7 ko 3 se connect
//        }
//     while(c.next!=null){// eska bhi koi null hoga ma c ko null se phelee le jyuga
//        c = c.next;  7 <-> 8 <-> 11 <->12 <-> 9 <-> 10 -> null
//       }                                              c
//    muje 10 ko 4 se jodna ha
//     c.next = z
//     z.prev = c
//     temp.child = null; uska child ko null point karna padega na
//    temp = z; ma temp ko aaga bhi to karuga temp = temp.next nahi karuga kyuki varna mera temp child ma chala jyega mereko aaga le gana ha