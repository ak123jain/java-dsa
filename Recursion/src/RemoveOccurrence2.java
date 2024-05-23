
import java.util.Scanner;

//remove all the occurrence of 'a' from a string s = "abcax"
public class RemoveOccurrence2 {
    static String Remove(String s ){
        if(s.length() == 0) return "";

        String SmallAns = Remove(s.substring(1));
        // f(abacx) -> f(bacx) -> f(acx) -> f(cx) -> f(x) -> f("")  abacx ka ans niklana ka liya hma chahiye bacx and so on
        // ab ham x ko check karege ki vo a to nahi ha or har baar 0 index vale element hi check karege
        //ab ham index naho puri string pas kar rahe string ka case ma
        // 1 sa esliye kyuki ya 0th index hma nahi milega
        char currentCharacter = s.charAt(0);//kisi bhi index ka element ko store karna ka liye string ma
        // jo hmara currentCharacter har baar last index par usko check kar rahe ha ki vo a ka equal ha ki nahi

        if( currentCharacter!= 'a'){
            return currentCharacter + SmallAns;
        }else{
            return  SmallAns;
        }
    }

    public static void main(String[] args) {
        //f(s,idx)// it will remove all the occurrence instance 'a' from the string
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(Remove(s));

    }
}
