import java.util.Scanner;

public class Square1234 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter teh no of row and column");
        int r = sc.nextInt();
        int c = sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
