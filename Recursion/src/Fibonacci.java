import java.util.Scanner;
//  calculate the nth fibonacci term
//   1 1 2 3 5 8
//   1 2 3 4 5 6 index no
public class Fibonacci {

    static int fibonacci(int n){
        if( n==1 || n==2){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("no you find the fibonacci term");
        int n = sc.nextInt();

        int fibo = fibonacci(n);

        System.out.println(fibo);
    }
}
