

import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no : ");
        int num = sc.nextInt();// integer user sa input la liya

        if(num % 2== 0){
            System.out.println("even no");
        }
        else{
            System.out.println("odd no");
        }
    }
}
