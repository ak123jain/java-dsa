package stacks;
import java.util.*;

public class Infix {
    public static void main(String[] args) {
        String str = "9-5+3*4/6";// eska ans == 6
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            // '0'-> 48 and '9' -> 57
            if(ascii>=48 && ascii<=57){// if ascii valve ye hui to vo ek no ha to usko val stack ma dal dege
                val.push(ascii-48);// val stack me us ascii val par jo no ha vo dalna ha to ascii-48
            }
            else if(op.size()==0)  op.push(ch);
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



// infix ma ham number ko  multiply divide subtract karta ha

// BODMAS
//          D , M > A , S
//   multiply divide same priority to equation ma left to right chalege
// String str = "9-5+3*4/6"; // all are character
// ma priority se solve karuga

// i made two stacks => ek me ma val daluga or ek me operator (check karka daluga)
//
// stack1 = val , stacks2 = op

// if(op.size()==0) op.push(ch)

// if(op.size()>0)
// if(op.peek() priority ){
//        >= ch )
// agar peek vale operator ki priority jada ha to stack1 ke val ha vo solve hone chahiye
// ma us stack1 me se top 2 val pop kar duga
// or peek vale operator ko bhi pop kar duga
// or phir us val par vo operation kar duga solve kar dga
// or val stack ma dal duga /
// or aage vale operator stack ma dal duga
// agar op stack me new operator se priority equal ya jada ha prioity to jo  operator baitha ha to phele usko solve karege
// new operator ki priority jada ha to usko push kar dege or agar nahi ha ya phir equal ha priority to jo operator baitha ha usko phele solve karege
// jab string khatam ho gyegi tab tab condition lagakar bache hue unko solve kar lege
// while(val.size>1)







