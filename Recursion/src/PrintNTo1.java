import java.util.Scanner;

public class PrintNTo1 {

    static void PrintIncreasing(int n){
        if(n == 1){
            System.out.print(" "+n);
            return ;
        }
        System.out.print(" "+n);
        PrintIncreasing(n-1);// agar reverse chahiye to call karne sa phele print kardo
        //System.out.print(" "+n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrintIncreasing(n);

    }
}
