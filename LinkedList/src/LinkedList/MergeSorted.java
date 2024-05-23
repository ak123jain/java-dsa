package LinkedList;
// merge two sorted linked list
public class MergeSorted {
    public static void main(String[] args) {

    }
}
// using Extra space
//list 1: 1  3  5  8  9  null
//       temp1
//        h1
//list 2: 2  6  7  null
//        h2
//       temp2
// mere ko do sorted list ko merge karka ha
// ek new node banauga or uska andar jis temp ki value choti hogi vo dal duga or us temp1 ya temp2 ko aaga kar duga
// new node : 1
//           temp
// phir ek new node or uska andar jis temp ki value choti hogi vo
// new node : 1    2
//           temp
// new node banna ka baad temp ko ussa attach kardo or temp ko aaga le gao

// mera dono temp1 or temp2 jo phele null par pucuh jyege usko khatam kar dege or dusra temp ka jitna bhi eleemnt ha uko as it is likh dege
// jo elemenet ma as it is likh raha hu unka liye ma new node nahi banauga ma aapna new node ka temp ko us list ka temp sa attached kar duga
//list 1: 1  3  5  8  9   null
//                 t1
//        h1
//list 2: 2  6  7  null
//        h2
//                  temp2

// new node : 1    2  3  4  5  6  7
//                                t    es temp ko temp1 se attached kar duga

// ma new node ma phele sa ek node bana raha hu or uska andar 100 dal diya or uska head ko temp se point kar diya ab jo bhi ma new node banauga usko 100(temp) vale se attache kar duga or phir temp ko aaga le gyuga

// new node : 100  1
//             t   a
// temp ko atache kar duga a se or phir temp ko a par le jyuga

// lekin jo ma list bana raha hu usma ma return head.next karuga kyuki mere ko 100 nahi chahiye














