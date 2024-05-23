package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer>  q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        System.out.println(q);
        Stack<Integer> st = new Stack<>();
        while(q.size()>0){
            st.push(q.remove());
        }
        while (st.size()>0){
            q.add(st.pop());
        }
        System.out.println(q);
    }
}

// ek queue se mana saree element stack ma dalee
// phir stack se queue ma dal diya

// add 1  2  3  4  5 pop
//stack
//5
//4
//3
//3
//2
//1
// add 5 4 3 2 1 pop
