package Stacks;

import java.util.Stack;
import java.util.Scanner;
// copy content of one stack to another in same order
public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();//
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("old stack : "+ st);
        // reverse order = hmna reverse order ma aapna new stack ma eleemnt copy kar diya
        Stack<Integer> t1 = new Stack<>();// new stack
        while(st.size()>0){
            int x = st.peek();// get element from st stack(5)
            t1.push(x);// new stack ma push kar diya (5)
            st.pop();// phir old stack ma se aapna us element(5) ko nikal do
           // t.push(st.pop()); ma ye kaam sirf ek line ma bhi kar sakta hu => mana new stack ma vo elemnt push kara jo mana purana ma se pop kara
        }
        System.out.println("new stack 1 :"+ t1);// reverse copy stack of st

        Stack<Integer> t2 = new Stack<>();// new stack
        while(t1.size()>0){
//            int y = t1.peek();
//            t2.push(y);
//            t1.pop();
            t2.push(t1.pop());// ma jo t1 ma se pop kar raha hu vo ma t2 ma push kar duga
        }
        System.out.println("new stack 2 :"+ t2);// reverse copy stack of t1
        System.out.println("t1 mera khali ho gaya : "+ t1);
    }
}

// muje ek stack ka element ko dusra stack ma copy karna ha to ma ab do new stack banuga phele me ma reverse copy kar duga reverse he copy hoga kyuki or koi option nahi ha phir ek or new stack create kauga phir usma copy kar duga to vo phir se reverse dal dega or mera cotent copy ho gaye ga

// 5  1           5
// 4  2           4
// 3  3           3
// 2  4           2
// 1  5           1
//    new stack   new stack(2)

// ma ek stack se dusra stack ma sirf revese order ma elelent copy kar sakta hu kyuki ma stack ka sirf 5 se get kar sakta hu direct 1 nahi
// esliye mana do new stack banaye

//