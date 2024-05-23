import java.util.Scanner;
// conversion of binary to decimal ?
public class Conversion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter teh binary_num");
        int binary_num = sc.nextInt();// binary no hmna user sa input la liya
        int pw = 1;// 2^0 = 1 power of 2
        int ans = 0;
        while(binary_num>0){
            int unit_digit = binary_num % 10;// binary no ki last value
            ans += unit_digit*pw;
            binary_num /= 10;
            pw *= 2;
        }
        System.out.println(ans);
    }
}


//  binary no (1101) = 1*2^3+ 1*2^2 + 0*2^1 + 1*2^0 = (decimal no)13 here  last 1 are unit digit of 1101 or uska baad ka unit digit of 110 phir 11 or phir 1
//             3210                           last 1
// 3210 are index value
                             // ham unit digit nikal rahe ha binary ko 10 sa % karka 1101%10= 1
                             // or phir binary ko har baar 10 sa divide tak last value chali gaye 1101/10= 110