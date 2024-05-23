import java.util.Scanner;// hmna scanner ko import kar liya es line sa

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the new lucky no");
        int num_1 = sc.nextInt();//es method ka through ham integer input la sekte ha or usko num_1 ka dabba ma store kara liya
        System.out.println("lucky no is" + num_1);
    }
}
