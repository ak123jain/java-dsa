package stacks;

import java.util.Stack;

public class PostfixToInfix2 {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        Stack<String> val = new Stack<>();
        for(int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57){
                  String s = "" + ch;
                  val.push(s);
            }else{
                String v1 = val.pop();
                String v2 = val.pop();
                char op = ch;
                String s = "(" + v1 + op + v2 + ")";
                val.push(s);
            }
        }
        System.out.println(val.peek());
    }
}


// prefix = "-9/*+5346"
//infix = "9-(5+3)*4/6"
// infix = v1 operator v2
// yaha muje infix aase he print karana ha
// to ma stack string ma luga

// infix = v1 operator v2
// prefix = operator v1 v2
// postfix = v1 v2 operator













