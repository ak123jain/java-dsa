package StringsBasics;
import java.util.*;
public class CheckPalindrome2 {
    public static void main(String[] args) {
        String str = "abcdcba";
        Boolean flag = true;// palindrome ha
        int i = 0;
        int j = str.length()-1;
        while(j>i){
            if(str.charAt(i)!=str.charAt(j)){// agar ye condition nahi chali to niche vali aapna aap chal gyegi
                flag= false;
                break;
            }
            i++;
            j--;
        }
        if(flag == true) System.out.println("palindrome");
        else System.out.println("not palindrome");
    }
}
