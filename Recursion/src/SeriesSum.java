// find the sum of n natural no inn alternative sign ?

import java.util.Scanner;

// n=5  f(n) = 1 - 2 + 3 - 4 + 5   n is odd to +
// f(n) = f(n-1) + n;

// n=6  f(n) = 1 - 2 + 3 - 4 + 5 -6  n is even to -
// f(n) = f(n-1) - n;

public class SeriesSum {
    static int SeriesSum(int n) {
        if (n == 0) return 0;
        if(n%2==0){
             return SeriesSum(n-1) - n;
         }
         else{
             return SeriesSum(n-1) + n;
         }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = SeriesSum(n);

        System.out.println(sum);

    }
}
