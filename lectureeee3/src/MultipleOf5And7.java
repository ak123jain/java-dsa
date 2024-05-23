import java.util.Scanner;

public class MultipleOf5And7 {
    public static void main(String[] args) {
// print the first multiple of 5 which is also a multiple of 7 ?
        Scanner sc = new Scanner(System.in);
        int num = 1;
        while (true) {
            if ((num % 5 == 0) && (num % 7 == 0)) {
                System.out.println("found a ans : " + num);
                break;

            }
            num++;
        }
    }
}