import java.util.Scanner;

public class TriangularPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of rows and column");
        int r = sc.nextInt();
        for (int i = 1; i <= r; i++) {//no of rows
            for (int j = 1; j <= i; j++) {// j depend karta ha ki us line ma kitna star ha  agar 1 row ha ti 1 star
                System.out.print("*");// no of  row = no of star
            }
            System.out.println();
        }
    }
}