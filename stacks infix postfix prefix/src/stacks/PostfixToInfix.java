package stacks;

import java.util.Stack;

public class PostfixToInfix {
    public static void main(String[] args) {
       String str = "953+4*6/-";
        Stack<Integer> val = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            // '0'-> 48 and '9' -> 57
            if(ascii>=48 && ascii<=57){
               val.push(ascii-48);
            }
            else{// agar operator ha => work
               int v2 =  val.pop();
               int v1 = val.pop();
                if(ch=='-') val.push(v1-v2);
                if(ch=='+') val.push(v1+v2);
                if(ch=='*') val.push(v1*v2);
                if(ch=='/') val.push(v1/v2);
            }
        }
        System.out.println(val.peek());

    }
}

// postfix evaluation
// postfix = "953+4*6/-" = str
// infix = "9-(5+3)*4/6" = 4

// yaha par mene infix solve karka print kara diya
//ma str travel karuga left to right
// ek he stack banuga agar no dikha to direct push or operator dikha to aupar ki do value ko v1 v2 man kar v1 operator v2 solve kar ke kar ke vapis stack ma dal duga































