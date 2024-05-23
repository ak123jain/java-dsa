package stacks;

import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        String infix = "9-(5+3)*4/6";// eska ans == 6
        Stack<String> val = new Stack<>();// ab ma val stack me string daluga kyuki meri string banige
        Stack<Character> op = new Stack<>();
        for(int i=0;i<infix.length();i++){
            char ch = infix.charAt(i);
            int ascii = (int)ch;
            // '0'-> 48 and '9' -> 57
            if(ascii>=48 && ascii<=57){// if ascii valve ye hui to vo ek no ha to usko val stack ma dal dege
                String s = "" + ch;
                val.push(s);
            }
            else if(op.size()==0 || ch=='(' || op.peek()=='(')  op.push(ch);// '(' bina soche openning bracket push kar do chahe phele ho
            else if(ch==')'){// closing dalna se phele openning ko solve kar do
                while(op.peek()!='('){
                    // work
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = o + v1 + v2;
                    val.push(t);
                }
                op.pop();// '(' openning bracket hata diya
            }


            else{// agar op stack ka size 0 nahi ha to jo phele se ha agar uski priority jada ha to usko solve kar lege
                if(ch=='+' || ch=='-'){// agar mera new character ye ha to mera stack ma ya to + - * / hoga tab bhi ma work to karuga he na kyuki enki prioprity mera equal ha + - se or * / se jada bhi ha
                    // work
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t =  v1 + v2 + o;
                    val.push(t);
                    // op.pop();// op ma jo bhi operator hoga
                    op.push(ch);// new char(operator) dal diya
                }
                if(ch=='*' || ch=='/'){
                    // agar mera op stack me * / ha to ma work karuga or agar + - ha to * / ko push kar duga kyuki + - ki priority kam ha
                    if(op.peek()=='*' || op.peek()=='/'){
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = op.pop();
                        String t =  v1 + v2 + o;
                        val.push(t);
                        // op.pop();// op ma jo bhi operator hoga
                        op.push(ch);
                    }
                    else op.push(ch); // op.peek()=='+')
                }
            }
        }

        // jab loop khatam ho gaya or val vale stack ki value ko khali karna ha or bach hue operator se solve kar dena ha
        while(val.size()>1){
            String v2 = val.pop();
            String v1 = val.pop();

            char o = op.pop();
            String t =  v1 + v2 + o;
            val.push(t);
            //op.pop();// op ma jo bhi o
        }
        String postfix = val.pop();
        System.out.println(postfix);// stack ka size 1 ho gaya stack ka size print kara diya

    }
}

// infix = "9-5+3*4/6"
//postfix = ""
// convert the infix to postfix
// value1 + value 2 =  value1 value2 +