package StringsBasics;
import java.util.*;
public class CheckPalindrome {
    public static void main(String[] args) {
    String str = "abcdcba";// ham strbuilder ka andar str esliye dal rahe ha taki ham stringbuilder ki properties use kar sake
    StringBuilder gtr = new StringBuilder(str);// hmna strinbuilder ka andar ek string de di
    gtr.reverse();
    String s = gtr + "";// ham string ka andar stringbuilder aase de sakte ha ya convert kar sakte ha
    if(str.equals(s)){
        System.out.println("palindrome");
    }
    else{
        System.out.println("not a palindrome");
    }

    }
}
