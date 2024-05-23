
import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter teh no");
        int n = sc.nextInt();
        int num = 1;
        while (num<=n){// jab tak hmari n ki value badi ha tab tak print karta rahe
            System.out.println(+num);
            num++;
        }


    }
}
