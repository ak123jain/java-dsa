package Stacks;

import java.util.Stack;

public class StackArray {
    public static void displayRec(Stack<Integer> st){// esko mereko reverse karna ha lekin mere se hua nahi
        if(st.size() ==0) return;
        int top = st.pop();// phele hma 4 nikal liya or baki ka element ko recursion ka through print kara diya
        System.out.print(top + " ");
        displayRec(st);
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();//
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("old stack : " + st);
        displayRec(st);// recursion ma ek kaam aap karo baki ke vo aapna aap kar dega
        //System.out.println(st);
        int n = st.size();
        int arr[] = new int[n];
        for(int i=n-1;i>=0;i--){// ma array ma last se element fill kar raha hu
            int x = st.pop();
            arr[i] = x;
        }
        for(int i=0;i<n;i++){
            int y = arr[i];
           // System.out.print(y + " ");
            st.push(y);
        }
        System.out.println();
        //System.out.println(st);
    }
}

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

// DISPLAY stack through recursion

// 4           1 2 3 4 stack print
// 3
// 2
// 1
// stack

// int top = st.pop();// phele hma 4 nikal liya or baki ka element ko recursion ka through print kara diya
// sout(top)
// display(st);
// st.push(top);// or phir us element ko dal bhi diya

//    Stack<Integer> t2 = new Stack<>();
//      while(st.size()>0){
//        t2.push(st.pop());
//        }
//       System.out.print(t2);