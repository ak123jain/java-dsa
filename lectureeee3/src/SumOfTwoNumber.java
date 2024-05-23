import java.util.Scanner;

public class SumOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);


        System.out.print("enter 1 num : ");
        int num_1 = sc.nextInt();

        System.out.print("enter 2 num  : ");
        int num_2 = sc.nextInt();

        int Sum = num_1 + num_2;
        System.out.println("sum of two no : "+Sum);
    }
}
