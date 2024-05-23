import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
// replacement of if and else condition
        String ans;// ans name ka ek string ha
        ans = (num % 2== 0) ? ("even") : ("odd");// num agar 2 sa divisible ha to even varna odd
        System.out.println(ans);
    }
}
