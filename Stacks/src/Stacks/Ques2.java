package Stacks;

import java.util.Stack;
import java.util.Scanner;
 // insertion at bottom / or at any index
public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();//
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("old stack : " + st);
        int idx = 3;
        int x = 67;// ye no insertion karna ha
        Stack<Integer> t1 = new Stack<>();// new stack
        while (st.size() > idx) {//jab tak mera size us idx se bada ha tab tak ma elelemnt normally push karuga new stack me
            t1.push(st.pop()); //ma ye kaam sirf ek line ma bhi kar sakta hu => mana new stack ma vo elemnt push kara jo mana purana ma se pop kara
        }
        st.push(x);// purana vale stack me he vo x dal diya
        while (t1.size() > 0) {// t1 me temporary element store kar the
            st.push(t1.pop()); // jitna ussa khali kara tha phir se bhar diya
        }
        System.out.println("new stack 1 :" + st);// reverse copy stack of st
    }
}


// ma us he stack ka andar change karuga phele to ma aapna old stack ko utna khali kar duga jis idx par mereko element dalna ha phir baad ma bhar duga

