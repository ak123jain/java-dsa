import java.util.Scanner;

public class ReadCharacter {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        // strings = collection of character
        // string ka input ham sc.next(); sa lete ha
        // hma character read karna ha to char ch = sc.next().charat(0) and the index value of character starting from 0
       // character = physics so p = 0 ,h = 1,s= 2, y = 3 ,
        System.out.println("enter the Character : ");
        char ch = Sc.next().charAt(0);
        System.out.println("Character is : "+ch);
    }
}
