import java.util.Scanner;

public class Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter teh string");
        String s = sc.nextLine();
        System.out.println(s);

        char ch = s.charAt(0);//0 index par jo caracter ha vo print ho gyagwe
        //kisi bhi index ka element ko store karna ka liye string ma
        System.out.println(ch);

//        for(int i=0;i<s.length();i++){
//            System.out.print(s.charAt(i));
//        }
        //System.out.println(s.substring(0,14));// string ko print karana ka liyre
        System.out.println(s.substring(1));

    }
}
