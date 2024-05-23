package StringsBasics;
import java.util.*;
// in case of string builder
public class Ques1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuilder str = new StringBuilder(sc.nextLine());// user se input lene ka liye string builfer ko
        System.out.println(str);
        //toggle
        // PhySiCS -> pHYsIcs
        for(int i=0;i< str.length();i++){
          //  p -> P
            // check alphabet small or capital
            Boolean flag = true;// true mean capital
            char ch = str.charAt(i);// character nikal rahe ha
            if(ch == ' ') continue;
            int asci = (int)ch;// character ki asci value ko store kar raha int ki form me
            if(asci>=97) flag = false;// small
            if(flag==true){
                asci += 32;// AB ES ASCI VALUE PAR JO CHAR HOGA USKO STORE KAR RAHE HA
                char dh = (char)asci;// asci value pa jo char usko store kar raha char ki form me (a)
                str.setCharAt(i,dh);// es idx par jo ele
            }
            else{
                asci -= 32;
                char dh = (char)asci;// asci value pa jo char usko store kar raha char ki form me (a)
                str.setCharAt(i,dh);// es idx par jo ele
            }
        }
        System.out.println(str);
    }
}
