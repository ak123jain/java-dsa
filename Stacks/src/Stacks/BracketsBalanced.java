package Stacks;
import java.util.*;
public class BracketsBalanced {

    public static boolean isBalanced(String str){
        Stack<Character> st = new Stack();
        int n = str.length();
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            else{// ch = ')' agar mera khali stack ma closing bracket aa gaya to false
                if(st.size()==0) return false;
                 if(st.peek()=='('){
                     st.pop();
                 }
            }
        }
        if(st.size()>0) return false;
        else return true;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("enter your string : ");
    String str = sc.nextLine();
        System.out.println(isBalanced(str));
    }
}

// check wheather a given brackets sequence is balanced or not?
// string str = "()(())" true

// we are using stack agar oppening brackets ha to push kar dege stack me
 // when we see closing brackets => to jo stack ma openning brackets ha usko pop kardo jo aupar bracket ha agar vo openning ha to pop kar de
// and ma agar stack empty ha to vo str balanced return true

//        string str = "()(())"

//
// (
// stack

 //   string str = "()(())" true


//
// pop
// stack

//   string str = "()(())"


// (
// pop
// stack

//   string str = "()(())"

// (
// (
// pop
// stack

//   string str = "()(())"


// pop
// (
// pop
// stack

//   string str = "()(())"

// stack is empty all are poped


// second condition agar last ma closing brackets aa gaya

// str = "(())())"

// if stack is empty or  closing brackets ha to return false

// str = ")()())"












