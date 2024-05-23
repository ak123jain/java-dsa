import java.util.Scanner;
//count the num of digit in a given num n ?
public class Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.print("enter teh  no : ");
        int num = sc.nextInt();
        while (num!=0){
            num = num/10;
            count++;
        }
        System.out.print("no of digit in number : "+count);
    }
}
