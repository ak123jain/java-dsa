package StringsBasics;
import java.util.*;
// in case of string toggle
public class Ques2 {
    public static void main(String[] args) {

        String str =  "PHysIcS";
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
                char dh = (char)asci; // asci value pa jo char usko store kar raha char ki form me (a)
                str = str.substring(0,i) + dh + str.substring(i+1);// asci value pa jo char usko store kar raha char ki form me (a) + dh + str.substring(i+1);
                // jis character ko ham change kar rahe ha vo to dh ma aa gaya or usse phele vale jitne bhi word the
                // vo str.substring(0,i) or usse bad vale jitne bhi word the vo str.substring(i+1)
            }
            else{
                asci -= 32;
                char dh = (char)asci;// asci value pa jo char usko store kar raha char ki form me (a)
                str = str.substring(0,i) + dh + str.substring(i+1);
            }
        }
        System.out.println(str);

    }
}
