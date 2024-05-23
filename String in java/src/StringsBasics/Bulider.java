package StringsBasics;
import java.util.*;

// string builder concept 1
public class Bulider {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        str.append("world");
        System.out.println(str);
        str.setCharAt(0,'k');// alpahabet ko change karna
        System.out.println(str);
        str.append("akash");
        System.out.println(str);
        str.insert(11,'m');//  alphabet ko insert karna
        System.out.println(str);
        str.deleteCharAt(0);
        System.out.println(str);
    }
}


// we use stringbuilder to save time complexity because whenever we a string to the existing string
// the so much time complexity is needed eg str  = "hello"  str += hhh   helloh  hellohh  hellohhh
// we add an string so we need string builder we can change string
// string ma immutability hoti thi esliye ham string ma change nahi kar sakta
// in these immutability is not we can change he string and individual character by setchar