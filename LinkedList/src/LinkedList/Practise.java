package LinkedList;

public class Practise {
    public static void main(String[] args) {

    }
}

// copy list with random pointer : construct a deep copy of a linked list where each node contain an additional random pointer which could point to any node in the list or null.
// es question ma hma deep copy banani ha jaha par har node ek random node ko bhi point kar raha ha


//   1      10    99    101    4    null
//   h
//   t1

// new node
// 0
// h
// t2

//Node h = new Node(0);
//Node temp2 = h;
//Node temp = head;
//// creating deep copy
//
//while(temp!=null){
//    Node t = New Node(temp.val);//ma har baar new node banuga or usko connect kar duga
//     temp2.next = t;// 0 vali node se connect
//        temp2 = temp2.next;
//        }

//jese he ma 1 par aaya ma ek new node(1) create karuga or usko 0 se link kar duga
// t1 = t1.next
// ab ma 10 par hu new node create (10) usko 1 se link kar duga
// jab tak t1!=null nahi hota tab tak
//

//   1      10    99    101    4    null
//   h
//   t1

// new node
// 0    1  10  99    101    4
// h
//                          t2

// es tarah se ma deep copy bana duga
// ma return h.next karuga

//class{
//    int val;
//    Node next;
//    Node random;
//        }

// 7-> 13 -> 11-> 10-> 1 -> null
// ek node mera khud ka data ko store karta ha next node ka adress ko store karta ha esliye vo 13 ko point kar raha ha
// lekin esma 7 kisi random ko bhi point karega
// man lete ha 13 ka random 7 ha to ma usko to point nahi kara sakta esliye ma duplicate banuga list ka

// har node mera do node ko point kar raha ha ek to uski next node ko or dusra random node ko

// step1 : simple deep copy


// list :       7-> 13 -> 11-> 10-> 1 -> null ---esma 7 do node ko point kar raha ha

// deep copy :  7-> 13 -> 11-> 10-> 1 -> null ---- esma 7 mera sirf 13 ko point kar raha ha kyuki ye sirf normal copy ha


// step 2 : alternate connection

// list :       7-> 13 -> 11-> 10-> 1 -> null
//              t1

// new node h3
//          t

// deep copy :  7-> 13 -> 11-> 10-> 1 -> null
//              t2

//  muje zig zag link karna ha 7 ko 7 se phir 7 ko 13 phir 13 11 11 10 10 1 1 phele orignal phir copy
// uska liye ma ek new node banaya h3
//
// ab t->t1 ko connect karega or phir t1 t2 ko t->t1->t2 connect kardo
// t.next = t1
// t1 = t1.next
// t = t.next

// list :       7-> 13 -> 11-> 10-> 1 -> null
//              t    t1

// new node h3
//

// deep copy :  7-> 13 -> 11-> 10-> 1 -> null
//              t2

// t.next = t2
// t2 = t2.next
// t = t.next

// list :       7-> 13 -> 11-> 10-> 1 -> null
//                  t1
//
// new node h3
//

// deep copy :  7-> 13 -> 11-> 10-> 1 -> null
//              t   t2

// same ma aase he karta rhuga

// t.next = t1
// t1 = t1.next
// t = t.next

// list :       7  13 -> 11-> 10-> 1 -> null
//                  t     t1
//
// new node h3
//

// deep copy :  7-> 13 -> 11-> 10-> 1 -> null
//                  t2


// aese he lagata rhege
//mera last step

// list :       7   13    11  10   1   null
//                                       t1
//
// new node h3
//

// deep copy :  7   13    11   10   1    null
//                                  t     t2

// t1 t2 ko head par le  aao
// or t ko new node par


// list :       7   13    11   10   1   null
//              t1
//
// new node h3
//           t

// deep copy :  7-  13   11-  10  1 - null
//              t2


//let take an example

// list :       7-  13 -  11  10-  1 - null
//                  t1
//
// new node h3
//           t

// deep copy :  7-  13 - 11-  10-  1 - null
//                  t2

// check in galley kon kaise connect hai
//  13 ka random 7 ha to
// check in question kon kiska random ha
// t2.random = t1.random.next = 7.next = 7
// ab t1 t2 ko move bhi karana ha
// t1 = t1.next.next t1 ko 7 se 13 le gaya
// t2 = t2.next.next
// do baar chalana padega kyuki vo zig zag link ha t1 t2 ko next step par le gane ka liye

// 7 (t1) ka random null ha to
// null.next kuch nahi hota
// if(t1.random==null) t2.random = null;
// aese he chalta rahege

// list :       7-> 13 - > 11 -> 10- -> 1 -> null
//              t1
//
// new node h3
//           t

// deep copy :  7-  13 - 11-  10-  1 - null
//              t2
// ab phir se list ko normally link karna ha

// t1.next = t2.next
// t1 = t1.next

// t2.next = t1.next
// t2 = t2.next

// es question ma bas deep copy banani ha list hi lekin har ek node ek random node ko bhi point kar ye challege ha uska sath deep copy banani ha bas







