package LinkedList;

public class OddEvenList {
    public static void main(String[] args) {

    }
}

// new node 0  for even
//  0
//  even
// tempe

// 10      11     1     4     6     5
// h
// temp

// new node 0 for odd
//   0
// odd
//  tempo

// mere odd even list ma phele node odd phir even sequence ma hoga
// 10 mera odd ha to ma odd node ko 10 se jod duga
// to ma tempo ko temp se jod duga
// or temp = temp.next or tempo ko 10 se connect karna ha  tempo.next = temp;

// new node 0  for even
//  0
//  even
// tempe

// 10      11     1     4     6     5
// h
// tempo   temp

// new node 0 for odd
// odd
//   0
//


// ab ma tempe ko temp se jod duga  tempe.next = temp ;or baad ma temp = temp.next

// new node 0  for even
//  even
//  0
//

// 10      11     1     4     6     5
// h
// tempo  tempe  temp

// new node 0 for odd
//  odd
//   0
//

// ab ma tempo ko temp se jod duga  tempo.next = temp; or baad ma temp = temp.next or tempo = tempo.next

// new node 0  for even
//  even
//  0
//

// 10      11     1       4      6     5
// h
//        tempe  tempo   temp

// new node 0 for odd
//  odd
//   0
//

// ab ma tempe ko temp se jod duga  tempe.next = temp; or baad ma temp = temp.next

// new node 0  for even
// even
//  0
//

// 10      11     1       4      6     5
// h
//                      tempe   tempo  temp

// new node 0 for odd
//  odd
//   0
//

// ab ma tempe ko temp se jod duga  tempe.next = temp; or baad ma temp = temp.next

// new node 0  for even
// even
//  0
//

// 10      11     1       4      6     5     null
// h
//                            tempo   tempe  temp

// new node 0 for odd
//  odd
//   0
//

// jab tak temp!=nell ha jab tak
// odd = odd.next
// even = even.next
// odd kissa connect hua 0  10  1  6
// even kissa connect hua 0  11  4  5

// odd ka piche even lagana ha
// odd ko even ke head se jod
// tempo.next = even
// return odd kyuki odd mear head ha






