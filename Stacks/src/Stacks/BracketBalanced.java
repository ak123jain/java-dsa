
//find the minimum no of brackets that we need to remove to make the given brackets sequence balanced
package Stacks;
        import java.util.*;
public class BracketBalanced {

    public static boolean isBalanced(String str){
        Stack<Character> st = new Stack();
        int n = str.length();
        int m = 0;
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(ch=='('){
                st.push(ch);
                m++;
            }
            else{// ch = ')' agar mera khali stack ma closing bracket aa gaya to false
                if(st.size()==0) return false;
                if(st.peek()=='('){
                    st.pop();
                    m--;
                }
            }
        }
        System.out.println("minimum no of bracket to remove for balancing " + m);// jitna sabse last ma hmare stack ma bracket bachege bas unko remove karna ha balanced karna ka liye
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