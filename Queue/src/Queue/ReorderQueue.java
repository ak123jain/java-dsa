package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReorderQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        Stack<Integer> st = new Stack<>();
        int n = q.size();
        for(int i=1;i<=(n/2);i++){
            st.add(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        for(int i=0;i<(n/2);i++){
             q.add( st.pop());
             q.add(q.remove());
        }
        // ab mera reverse queue aa gaya
        while(n>0){
            st.add(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        System.out.println(q);
    }
}

// reorder queue (interleave 1st half with 2nd half)
// given queue queue size vo even ha
// eg  remove  1 2 3 4   5 6 7 8  add

// 1  5 2  6  3 7  4  8  ans

// we can solve the question with using an stack

// stack
//
// 4
// 3
// 2
// 1

// phir vapis unko queue ma add kar diya
//
//  remove 5  6  7  8     4  3  2  1  add

 // phir se stack ma dal diya first half

// stack
// 8
// 7
// 6
// 5

// 1  5 2  6  3 7  4  8  ans

// remove    4  3  2  1  add

// ma ulta bhi bana sakta hu baad ma ma stack ma dal kar reverse kar duga

// see the ans muje 8 ke sath 4 rakhna ha  7 ke sath 3  6 , 2 or  5 1

// ma queue ma  stack se 8 dala or phir uska jo last ma remove 4 piche se la kar add kar diya  matlab queue ka peek ko phir se add kar diya phir stack se 7 le aaya phir se queue ma 3 aaga add kar diya
//  8  4  7  3  6  2  5  1

// ab esko phir se stack ma dal kar phir se queue ma dal duga to ye reverse ho gyega


// st1 move first half to stack
// empty stack to queue
// st3  move 1 half to stack
// st4 one by one add st,peek() & phir q.peek add to queue
// reverse the queue

















