package Stacks;

import java.util.ArrayList;// header file
import java.util.Stack;

public class Basics {
    public static void main(String[] args) {
       //int arr[] = new int[6];
       // ArrayList<Integer> sc = new ArrayList<>();
        Stack<Integer> st = new Stack<>();// empty stacks
        System.out.println(st.isEmpty());// boolean expression ha
        st.push(1);// ek box ka andar element bhar rahe ha
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st.peek());// ma eese stacks ma sabse aupar (baad vale) vale element ko get kar sakta hu
        st.pop();
        System.out.println(st);
        System.out.println("size is : " +st.size());
        // ma phle vale element ko bhi access kar sakta hu
        System.out.println(st.peek());
        while(st.size()>1){
            st.pop();// meen pure stack ko khali kar diya sirf phele eleent ko chod kar
        }
        System.out.println(st.peek());// jo elemeny=t sabse phele dala
        System.out.println(st);
    }
}

// 4 ab muje elemenet pop karna hua to ma phele sirf 4 ko he kar sakta hu
// 3
// 2
// 1
// agar muje 3 element ko access karna ha to 4 ko delete karna padega

// 1  2  3  4
// 1 mana phele dala

// LIFO = last in fast out

// jo element hma sabse last ma daala usko ham phele nikal skte ha
//
// FILO  = first in last out

// jo sabse phele element insert hua vo last ma out hota ha

// time complexity
// push ki TC 0(1)
// pop lli TC 0(1)
// peek ki TC 0(1)
// agar mereko 3 elemeent access karna ha to mereko usse aupar vale element nikal ne padege to TC 0(n)


// problem of stack = jab tak ma aupar vale element ko pop na karo tab tak ma niche vale element ko accessed nahi kar sakta


// get       TC        SC
//
//array     0(1)      0(1)
// LL       0(n)      0(1)
// stack    0(n)     0(n)
//
// eleemnet ko get kana ki TC or SC




