import java.util.Scanner;

 // wap to check the given string is palindrome or not ?
// ans = agar given string reverse string ka equal ha to palindrome
public class Palidrome{
    static String Reverse(String s ,int idx){
        if(idx == s.length()) return "";

        String SmallAns = (Reverse(s,idx+1));
        // f(s,0) -> f(s,1) -> f(s,2) -> f(s,3) -> f(s,4) -> f(s,5)  ya 5 index tak call laga kar chad dega phir check karlo 'a'
        //ka equal ha agar currenelement to hata do
        char currentCharacter = s.charAt(idx);//kisi bhi index ka element ko store karna ka liye string ma
        // jo hmara currentCharacter har baar last index par usko check kar rahe ha ki vo a ka equal ha ki nahi

        return SmallAns + currentCharacter;
    }

    public static void main(String[] args) {
        //f(s,idx)// it will remove all the occurrence instance 'a' from the string
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev = Reverse(s,0);
        if(rev.equals(s)){// agar reverse equal ha
            System.out.println("%s is palidrome ");
        }
        else{
            System.out.println("%s is not palidrome");
        }

    }
}
