import java.util.Scanner;
// print the first n factorial number ?
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter teh no");
        int num = sc.nextInt();
        int product = 1;
        for(int i=1;i<=num;i++){
            product = product*i;
            System.out.println("Factorial of " + i + " is  :   " + product);
        }

    }
}
