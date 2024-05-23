package Stacks;
// phele ham stack ko print kar rahe the using new stack
import java.util.Stack;

public class LinkedListArray {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();//
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("old stack : " + st);
        Stack<Integer> t = new Stack<>();
        while(st.size()>0){
            t.push(st.pop());
        }
        while(t.size()>0){
            int x = t.pop();
            System.out.print(x+" ");
            st.push(x);
        }
        System.out.println();
        //System.out.println(st);
    }
}

// normally stack ko print karege array ka through


// phele ham stack ko print kar rahe the using new stack

// 4   1        1 2 3 4 stack print
// 3   2
// 2   3
// 1   4
//    new stack

// phele ma aapna dusra stack ka andar elemenet bhar duga or phele ko khali kar duga or phir new stack ko khai karuga or old ma dal duga or sath ma print bhi karta rahuga
// ma aase he stack ka eleemnt ko print karat hu inner mechanism

// stack print through array

// sabse phele ma ek array banuga utna size ka jitna ki stack ka size ha

// 4           1 2 3 4 stack print
// 3
// 2
// 1
// stack

//   array[] = 1  2  3  4  ma array ma element fill karuga last se or stack ko khali kar duga
//        idx  0  1  2  3
// ab ma 0 idx se array print karuga or stack ma dal duga




