package LinkedList;
// reverse  a linked list without recursion
public class Reverse2 {
    public static void main(String[] args) {

    }
}

// 3     5  1  2  4
// h
// curr


// agla
// null
// prev

// mana head par current ko point karaya or null par aagla or previous ko
// ma tino ko ek ek baar move karuga
// 1 . agla = curr.next
// 2 . curr.next == prev to curr null ko point karega => curr ko hmesha piche point karana ha kyuki reverse karna ha
// 3.  prev == curr
// 4. curr = agla

// 3      5    1  2  4  null
// h      agla
// prev   curr
//

//
// null
//

// jab tak mera agla or agla or nxt null ka equal nahi hota tab tak looop chalega or prev ma head return karuga
 //