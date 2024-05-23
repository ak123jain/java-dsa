
// question write a program to print a value if it is even or divisible by 3
//import java.util.Scanner;
//public class ConditionalOperator {
 //   public static void main(String[] args) {
  //      Scanner sc = new Scanner(System.in);
  //      System.out.print("enter the no : ");

  //      int value = sc.nextInt();

  //      if( value % 2 == 0 && value % 3 == 0){
  //          System.out.print("found the ans : " +value);
  //      }
   // }
//}
// question 2 write a program to print a value if it is divisible by 5 or 3
import java.util.Scanner;
public class ConditionalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no : ");

        int value = sc.nextInt();

        if( value % 5 == 0 || value % 3 == 0){
            System.out.print("found the ans : " +value);
        }
    }
}
