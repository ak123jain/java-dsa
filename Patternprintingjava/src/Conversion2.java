import java.util.Scanner;
// conversion of decimal to binary
public class Conversion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal_num = sc.nextInt();
        int ans = 0;
        int pw = 1;// power of 10 10^0 = 1
        while(decimal_num>0){
            int parity = decimal_num % 2;
            ans += parity*pw;
            pw*=10;
            decimal_num/= 2;
        }
        System.out.println(ans);

    }
}
//    let decimal no be 13 so we take lcm of 13 by using 2  2|13
//                                                          2|6 -> 1 = parity
//                                                          2|3 -> 0
//                                                           |1 -> 1 so 1101
//                                                1*10^0+0*10^1+1*10^2+1*10^3 = ans