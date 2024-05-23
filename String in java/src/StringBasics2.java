import java.awt.*;
import java.util.Scanner;

public class StringBasics2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String str = "Physics Wallah";
//        System.out.println(str.contains("wall"));
//        System.out.println(str.startsWith("phy"));
//        System.out.println(str.endsWith("ah"));
//        System.out.println(str.toLowerCase());
        String s1 = "abc";
        String s2 = "bhj";
        String s3 = s1.concat(s2);
        System.out.println(s3);
    }
}
