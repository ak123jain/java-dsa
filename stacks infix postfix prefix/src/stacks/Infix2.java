package stacks;
import java.util.*;

public class Infix2 {
    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";// eska ans == 6
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            // '0'-> 48 and '9' -> 57
            if(ascii>=48 && ascii<=57){// if ascii valve ye hui to vo ek no ha to usko val stack ma dal dege
                val.push(ascii-48);// val stack me us ascii val par jo no ha vo dalna ha to ascii-48
            }
            else if(op.size()==0 || ch=='(' || op.peek()=='(')  op.push(ch);// '(' bina soche openning bracket push kar do chahe phele ho
            else if(ch==')'){// closing dalna se phele openning ko solve kar do
                while(op.peek()!='('){
                    // work
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if(op.peek()=='-') val.push(v1-v2);
                    if(op.peek()=='+') val.push(v1+v2);
                    if(op.peek()=='*') val.push(v1*v2);
                    if(op.peek()=='/') val.push(v1/v2);
                    op.pop();
                }
                op.pop();// '(' openning bracket hata diya
            }


            else{// agar op stack ka size 0 nahi ha to jo phele se ha agar uski priority jada ha to usko solve kar lege
                if(ch=='+' || ch=='-'){// agar mera new character ye ha to mera stack ma ya to + - * / hoga tab bhi ma work to karuga he na kyuki enki prioprity mera equal ha + - se or * / se jada bhi ha
                    // work
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if(op.peek()=='-') val.push(v1-v2);
                    if(op.peek()=='+') val.push(v1+v2);
                    if(op.peek()=='*') val.push(v1*v2);
                    if(op.peek()=='/') val.push(v1/v2);
                    op.pop();// op ma jo bhi operator hoga
                    op.push(ch);// new char(operator) dal diya
                }
                if(ch=='*' || ch=='/'){
                    // agar mera op stack me * / ha to ma work karuga or agar + - ha to * / ko push kar duga kyuki + - ki priority kam ha
                    if(op.peek()=='*' || op.peek()=='/'){
                        int v2 = val.pop();
                        int v1 = val.pop();
                        if(op.peek()=='*') val.push(v1*v2);
                        if(op.peek()=='/') val.push(v1/v2);
                        op.pop();// op ma jo bhi operator hoga
                        op.push(ch);
                    }
                    else op.push(ch); // op.peek()=='+')
                }
            }
        }

        // jab loop khatam ho gaya or val vale stack ki value ko khali karna ha or bach hue operator se solve kar dena ha
        while(val.size()>1){
            int v2 = val.pop();
            int v1 = val.pop();
            if(op.peek()=='-') val.push(v1-v2);
            if(op.peek()=='+') val.push(v1+v2);
            if(op.peek()=='*') val.push(v1*v2);
            if(op.peek()=='/') val.push(v1/v2);
            op.pop();// op ma jo bhi o
        }
        System.out.println(val.peek());// stack ka size 1 ho gaya stack ka size print kara diya
    }
}


// ( es bracket ka stack ma aata he jo bhi aayega direct work start
//esma first priority () ko de di jab stack ma ( aaya to uska baad value or operator dono aayege work karege or jab tak stack ka peek ( bracket nahi dikha tab tak work karta rahege or jab dikhaga'(' tab nikal dege'('

// m ')' nahi daluga stack me
//

// '(' aalag se character h

//if(op.size()==0 || ch=='(') {
//    ma push kar duga
//        }

// infix = a+ b
// prefix = +ab
// postfix = ab +















