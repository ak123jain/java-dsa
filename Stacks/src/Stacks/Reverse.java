package Stacks;

import java.util.Stack;
// reverse stack
public class Reverse {
    public static void pushAtBottom(Stack<Integer> st , int x){// through recursion phele ma recursion se pura stack khali kar duga phir base case se element push kar duga or phir baki ka jo element ikal the unha dal duga
        if(st.size()==0){
            st.push(x);
            return;
        }
       int top = st.pop();
       pushAtBottom(st,x);
       st.push(top);
    }
    public static void Reverse(Stack<Integer> st){
        if(st.size() ==1) return;
        int top = st.pop();// phele hma 4 nikal liya or baki ka element ko recursion ka through print kara diya
        Reverse(st);
        pushAtBottom(st,top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("old stack : " + st);
        Reverse(st);
        System.out.println("reverse stack through recursion :"+st);
        Stack<Integer> t1 = new Stack<>();
        while(st.size()>0){
            t1.push(st.pop());
        }
        Stack<Integer> t2 = new Stack<>();
        while(t1.size()>0){
            t2.push(t1.pop());
        }
        while(t2.size()>0){
            st.push(t2.pop());
        }
        //System.out.println("reverse stack " +st);

    }
}

// do new stack bana old stack ko 1 stack ma dal or phir 1 stack ko 2 me dal de or phir second stack se old me dal de


// REVERSE through recursion
// if(st.size()==1) return; // agar ek he element ha to uska reverse vo he hota ha
// int top = st.pop() phele wale element ko nikal liya
// reverse(st)// baki jo ha vo recursion ka through aapna aap reverse ho gaye
// pushAtbottom(top); jo pop kiya last ma dal diya