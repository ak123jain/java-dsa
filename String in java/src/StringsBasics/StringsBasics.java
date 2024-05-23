package StringsBasics;
import java.util.*;
public class StringsBasics {
    public static void main(String[] args) {
        // decleration of strings
//       String str = "College Wallah";
//        System.out.println(str);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter your name" );
//        String s = sc.nextLine();  // take user input
//        System.out.println(s);
        String str = "Hello";
        String gtr = "Dello";
        // str > gtr then thy give +ve ans
        int std = str.length();
        char stf = str.charAt(0);
        int sfg = str.indexOf("j");// character ka ind ko niklata ha
//        System.out.println(std);
//        System.out.println(stf);
//        System.out.println(sfg);
        System.out.println(str.compareTo(gtr));
    }
}

//compareto function ma
//
//  let take two string one is str and other  is gtr
//
//1  if  str == gtr     then compareto function give 0
//2  str > gtr   lexographically  > 0
//3  str < gtr  < 0
//
//let taken an eg  str = bbc  gtr = abc
//                    str.compareto(gtr)
//        str     gtr
//        bbc     abc   then str > gtr bcoj the ascii value of b is greator than a  so ans will be positive
//        abd     abc   so  str > gtr so ans will be +ve
//        abc     zbc   so gtr > str  so ans will be -ve
