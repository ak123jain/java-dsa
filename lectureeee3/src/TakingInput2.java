import java.util.Scanner;

public class TakingInput2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the name : " );
        String name = sc.nextLine();// hmana (string name) ma string input la liya or
        System.out.println("name is : "  + name);

        System.out.println("enter the lucky no :");
        int num_1 = sc.nextInt();// hmana integer input la liya or num_1 ma store kar liya
        System.out.println("lucky no is : "+num_1);
// string = collection of character
    }
}
