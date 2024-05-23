import java.util.Scanner;
// print the reverse of given number ?
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no : ");
        int n = sc.nextInt();
        int reverse = 0;
        int lastdigit = 0;
        while(n!=0){
            lastdigit = n%10;
            reverse = reverse + lastdigit;
            reverse = reverse*10;
            n = n/10;
        }// ya loop jab tak khatam nahi hoga jab tak n ki value 0 nahi ho gati matlab reverse ki value jab hi ek sath print hogi jab n ki value
        // 0 ho jyagi
        reverse = reverse /10;
        System.out.println(reverse);
    }
}
