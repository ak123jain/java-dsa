import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// lastdigit = n%10 , n = 1234 , n/10 = 123
        int sum = 0;
        System.out.print("enter the no : ");
        int num = sc.nextInt();
        int lastdigit = 0;
        while(num!=0){
            lastdigit = num%10;
            sum = sum + lastdigit;
            num = num/10;
        }
        System.out.println("sum of digit of given no : " +sum);
    }
}
